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
        String name = b.getString("nname");
        setTitle(name);

        if (name.equals("Ismail Arafa")) {
            bt.setBackgroundResource(R.mipmap.amr);
        } else if (name.equals("Mohammed Abdo")) {
            bt.setBackgroundResource(R.mipmap.amr);
        } else if (name.equals("Doaa Mohammed")) {
            bt.setBackgroundResource(R.mipmap.amr);
        } else if (name.equals("Asmaa Mahmoud")) {
            bt.setBackgroundResource(R.mipmap.amr);
        } else if (name.equals("Amr Abdelhameed")) {
            bt.setBackgroundResource(R.mipmap.amr);
        }
    }
}
