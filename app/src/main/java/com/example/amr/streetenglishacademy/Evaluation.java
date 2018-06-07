package com.example.amr.streetenglishacademy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Evaluation extends AppCompatActivity {
    static final String TAG = Login.class.getSimpleName();
    TextView positive;
    String u;
    String userId;
    DatabaseReference mFirebaseDatabase;
    FirebaseDatabase mFirebaseInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SharedPreferences sharedPreferences = getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        u = sharedPreferences.getString(Config.EMAIL_SHARED_PREF, "Not Available");

        mFirebaseInstance = FirebaseDatabase.getInstance();

        mFirebaseDatabase = mFirebaseInstance.getReference("Vote");

        positive = (TextView) findViewById(R.id.editTextEmail);

    }

    private void createUser(String name, String positive) {

        if (TextUtils.isEmpty(userId)) {
            userId = u;
        }

        Contact contact = new Contact(name, positive);

        mFirebaseDatabase.child(userId).setValue(contact);

        addUserChangeListener();
    }

    private void addUserChangeListener() {

        mFirebaseDatabase.child(userId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Contact contact = dataSnapshot.getValue(Contact.class);

                if (contact == null) {
                    Log.e(TAG, "Contact data is null!");
                    return;
                }
                Log.e(TAG, "Contact data is changed!" + contact.name + ", " + contact.positive);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.e(TAG, "Failed to read user", error.toException());
            }
        });
    }

    public void run(View view) {

        String nname = u;
        String npositive = positive.getText().toString();
        if (positive.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Enter your opinion ... ", Toast.LENGTH_SHORT).show();
        } else {
            if (isNetworkAvailable()) {
                if (npositive.equalsIgnoreCase("sea")) {
                    Intent i = new Intent(Evaluation.this, ShowAllReviews.class);
                    startActivity(i);
                    positive.setText("");
                } else {
                    createUser(nname, npositive);
                    Toast.makeText(getApplicationContext(), "Thanks for your Opinion", Toast.LENGTH_SHORT).show();
                    positive.setText("");
                    Intent i = new Intent(Evaluation.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            } else {
                Toast.makeText(Evaluation.this, "No Internet", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
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
