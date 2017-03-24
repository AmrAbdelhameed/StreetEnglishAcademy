package com.example.amr.streetenglishacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ImageUser extends AppCompatActivity {
    Button bt;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_user);

        bt = (Button) findViewById(R.id.HH);
        t = (TextView) findViewById(R.id.textView222);

        Intent in = getIntent();
        Bundle b = in.getExtras();
        String id = b.getString("nid");
        String name = b.getString("nname");
        String des = b.getString("ndes");
        setTitle(name);
        t.setText(des);

        if (id.equals("1")) {
            bt.setBackgroundResource(R.mipmap.amr);
        } else if (id.equals("2")) {
            bt.setBackgroundResource(R.mipmap.newiconnn);
        } else if (id.equals("3")) {
            bt.setBackgroundResource(R.mipmap.iconsetting);
        } else if (id.equals("4")) {
            bt.setBackgroundResource(R.mipmap.reviews);
        } else if (id.equals("5")) {
            bt.setBackgroundResource(R.mipmap.close);
        } else if (id.equals("6")) {
            bt.setBackgroundResource(R.mipmap.amr);
        }
    }
}
