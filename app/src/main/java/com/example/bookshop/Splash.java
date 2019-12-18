package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    private ProgressBar progressBar;
    public int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progressBarId);
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                doProgress();
                startApp();
            }
        }));
        thread.start();
    }

    public void doProgress(){

        for (progress=25; progress<=100; progress = progress+25){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }

    public void startApp(){
        Intent intent = new Intent(Splash.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
