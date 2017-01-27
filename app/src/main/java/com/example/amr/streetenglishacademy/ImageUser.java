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
        String id = b.getString("nid");
        String name = b.getString("nname");
        setTitle(name);
        if (id.equals("1") || id.equals("3") || id.equals("5") || id.equals("7") || id.equals("9") || id.equals("11")) {
            bt.setBackgroundResource(R.mipmap.amr);
        }
    }
}
