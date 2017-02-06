package com.example.amr.streetenglishacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsReview extends AppCompatActivity {

    TextView pos, neg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_review);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pos = (TextView) findViewById(R.id.i2);
        neg = (TextView) findViewById(R.id.i4);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name_user");
        String pos_op = extras.getString("positive_user");
        String neg_op = extras.getString("negative_user");

        setTitle(name);
        pos.setText(pos_op);
        neg.setText(neg_op);

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
