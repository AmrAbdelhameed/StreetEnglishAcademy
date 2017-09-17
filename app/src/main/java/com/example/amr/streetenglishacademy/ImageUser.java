package com.example.amr.streetenglishacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ImageUser extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_user);

        bt = (Button) findViewById(R.id.HH);

        Intent in = getIntent();
        Bundle b = in.getExtras();
        int name = b.getInt("pic");

        bt.setBackgroundResource(name);
    }
}
