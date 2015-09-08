package com.wearesmiths.kattebel.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.wearesmiths.kattebel.R;

public class FirstScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        Button new_btn = (Button) findViewById(R.id.new_btn);
        new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(FirstScreen.this, NoteEdition.class),3);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false; // no menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
