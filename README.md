The communication between a phone and a watch is established thanks to Bluetooth.

# Getting started with Android Wear

1. Plug the handheld (phone) with the PC.
2. Enable debugging mode in the developers options
3. Pair the phone with the watch (download the Wear app on Google Play)
4. Enable debugging mode on the watch (just like you do it with a phone)
5. Type ```adb devices``` in your terminal to make sure your phone is detected
6. In the wear app on your phone, make sure everything is OK under 'Debugging over Bluetooth
7.
```shell
adb forward tcp:4444 localabstract:/adb-hub
adb connect localhost:4444
```

Nown, in the wear app on your phone, make sure everything is OK under 'Debugging over Bluetooth', once again, and you're done!

# Secret keys

There are two Parse keys to replace in ```mobile/src/main/java/com/wearesmiths/kattebel/KattebelAPI.java``` and in ```test-endpoints.sh```:

- APPLICATION-id
- JAVASCRIPT-id

# Specs

## Handheld app

Home Screen: 2 buttons

### Access an existing note

Opens a popup asking for a pin code. Then, if pincode is correct, redirects the user to the actual note (see below).

### New note

Opens a blank windows with only a text area (empty).There's a floating button to synchronize and get a pincode. The note is frequently saved, automatically, on the remote server.

# API

http://kattebel.parseapp.com/