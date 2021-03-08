package com.bananaemperor.homeworksux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;

public class coolActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Extra_Message);
        TextView textMsg = findViewById(R.id.message);
        textMsg.setText(message);

    }
}