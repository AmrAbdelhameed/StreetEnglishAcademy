package com.example.amr.streetenglishacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    Button i_splash;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        i_splash = (Button) findViewById(R.id.i_splash);
        textView = (TextView) findViewById(R.id.textView);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        i_splash.startAnimation(animation);
        textView.startAnimation(animation);

        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}