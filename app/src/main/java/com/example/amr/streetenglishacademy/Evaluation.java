package com.example.amr.streetenglishacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class Evaluation extends AppCompatActivity {

    EditText Name,positive,negative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Name = (EditText)findViewById(R.id.editTextName);
        positive = (EditText)findViewById(R.id.editTextEmail);
        negative = (EditText)findViewById(R.id.editTextPhone);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
