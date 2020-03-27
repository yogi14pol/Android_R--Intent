package com.clicks.yogi.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Typecasting...
    nextActivity = findViewById(R.id.btn);

    nextActivity.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            // Type 1...
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
/*
            // Type 2...
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
*/
        }
    });

    }
}