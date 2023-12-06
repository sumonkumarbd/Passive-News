package com.sumonkmr.passivenews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        Runnable runnable = () -> {
            Intent intent = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(intent);
        };

        handler.postDelayed(runnable,2000);


    }

}