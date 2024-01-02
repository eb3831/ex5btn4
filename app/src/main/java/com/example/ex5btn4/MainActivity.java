package com.example.ex5btn4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);

    }


    public void clicked(View view) {
        num++;
        tv.setText("this is click number: "+num);
        if (num%7==0){
            tv.setText("BOOM!");}

    }
            }