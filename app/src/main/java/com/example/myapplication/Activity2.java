package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class Activity2 extends AppCompatActivity{

    private TextView textView2;

    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        // Capture the layout's TextView and set the string as its text
        textView2 = findViewById(R.id.textView2);
        textView1 = findViewById(R.id.textView1);
        Intent intent = getIntent();
        String number = intent.getStringExtra("conter");
        textView2.setText(number);
        textView1.setText("HELLO");



    }
}