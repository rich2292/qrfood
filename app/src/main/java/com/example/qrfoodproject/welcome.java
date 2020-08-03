package com.example.qrfoodproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qrfoodproject.login.MainActivity;
import com.example.qrfoodproject.login.sessionCheck;

public class welcome extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    startActivity(new Intent().setClass(welcome.this, Home_QRfood.class));
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

    }
}

