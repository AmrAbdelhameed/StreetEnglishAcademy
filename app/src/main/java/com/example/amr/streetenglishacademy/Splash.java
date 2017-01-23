package com.example.amr.streetenglishacademy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mediaPlayer = MediaPlayer.create(Splash.this, R.raw.splash_voice);
                    mediaPlayer.start();
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    Splash.this.finish();
                }
                //startActivity(new Intent(Intent.ACTION_DIAL , Uri.fromParts("tel",num,null)));
            }
        });
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        mediaPlayer.release();
    }
}