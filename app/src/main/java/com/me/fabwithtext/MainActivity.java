package com.me.fabwithtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.me.textfab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.call_button);
    }
}
