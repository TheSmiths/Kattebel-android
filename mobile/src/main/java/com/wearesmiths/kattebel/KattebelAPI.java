package com.wearesmiths.kattebel;

import com.google.gson.JsonObject;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.RequestBody;

import org.json.JSONObject;

/**
 * Created by romain on 9/7/15.
 */
public class KattebelAPI {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static final String BASE_URL      = "https://kattebel.parseapp.com";
    public static final String NEW_SYNC_CODE = "/note/{uuid}/sync";
    public static final String NEW_UUID      = "/note/new";
    public static final String GET_NOTE      = "/note/{uuid}";
    public static final String UPDATE_NOTE   = "/note/{uuid}/update";

    private static final OkHttpClient client = new OkHttpClient();

    public KattebelAPI() {}

    private static Request newRequest(String endPoint, RequestBody body) {
        Request.Builder builder = new Request.Builder()
                .url(BASE_URL.concat(endPoint))
                .header("X-Parse-Application-Id", "APPLICATION-id")
                .addHeader("X-Parse-Javascript-Key", "JAVASCRIPT-id");

        if (body != null)
            builder.post(body);

        Request request = builder.build();
        return request;
    }

    public static void getNewSyncCode(String uuid, Callback callBack) {
        Request req = newRequest(NEW_SYNC_CODE.replace("{uuid}", uuid), null);
        client.newCall(req).enqueue(callBack);
    }

    public static void getNewUUID(Callback callBack) {
        Request req = newRequest(NEW_UUID, null);
        client.newCall(req).enqueue(callBack);
    }

    public static void getNote(String uuid, Callback callBack) {
        Request req = newRequest(GET_NOTE.replace("{uuid}", uuid), null);
        client.newCall(req).enqueue(callBack);
    }

    public static void updateNote(String uuid, String content, Callback callBack) {
        String json = "{\"content\": \""+content+"\"}";
        RequestBody body = RequestBody.create(JSON, json);

        Request req = newRequest(UPDATE_NOTE.replace("{uuid}", uuid), body);

        client.newCall(req).enqueue(callBack);
    }
}
