package com.dimas.intenandroid.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dimas.intenandroid.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        goingToNextStep();
    }

    private void goingToNextStep() {
        Thread timerThread = new Thread(){
          public void run(){
              try{
                  sleep(3000);
              } catch (Exception e){
                  e.fillInStackTrace();
              }finally {
                  Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                  startActivity(intent);
              }
          }
        };

        timerThread.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
