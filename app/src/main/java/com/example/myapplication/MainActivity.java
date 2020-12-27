package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private int count1=0;
    private Button button1;
    private Button button2;
    private TextView textView1;
    private String toast1;



    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);

    }

    public void sayHello(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        textView1 = (TextView) findViewById(R.id.textView1);
        String message = textView1.getText().toString();
        intent.putExtra("conter",message);
        startActivity(intent);




        //Toast toast=Toast.makeText((this,"HELLO:"+textView1.getText()));
        Toast.makeText(this, "HELLO:"+textView1.getText(), Toast.LENGTH_LONG).show();
    }

    public void count(View view) {
        ++count1;
        if(textView1.getText()!=null)
        {
            textView1.setText(Integer.toString(count1));
        }
    }
}