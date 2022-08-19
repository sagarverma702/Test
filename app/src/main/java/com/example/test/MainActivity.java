package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText userInput;
    public TextView userText;
    public Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput=findViewById(R.id.textbox);
        userText=findViewById(R.id.usertext);
        Submit=findViewById(R.id.submit_btn);

        Submit.setOnClickListener(view -> {
          String UserValue= userInput.getText().toString();
          userText.setText(UserValue);

            Intent intent = new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);

            intent.putExtra("message_key", UserValue);
            startActivity(intent);
        });

    }
}