package com.example.amr.streetenglishacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView textview;
    android.support.design.widget.CollapsingToolbarLayout toolbar_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textview = findViewById(R.id.textview);
        toolbar_layout = findViewById(R.id.toolbar_layout);

        Intent sentIntent = getIntent();
        Bundle sentBundle = sentIntent.getExtras();
        assert sentBundle != null;
        String name = sentBundle.getString("name");
        String desc = sentBundle.getString("desc");
        int image = sentBundle.getInt("image");

        toolbar_layout.setBackgroundResource(image);
        setTitle(name);
        textview.setText(desc);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
