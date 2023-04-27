package com.example.costumedilogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dilogue d = new Dilogue(MainActivity.this);
        d.setCancelable(false);
        d.show();
    }
}