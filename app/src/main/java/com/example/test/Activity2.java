package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public TextView Header,bottomline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Header=findViewById(R.id.Header);
        bottomline=findViewById(R.id.bottomline);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        bottomline.setText(str);
    }
}