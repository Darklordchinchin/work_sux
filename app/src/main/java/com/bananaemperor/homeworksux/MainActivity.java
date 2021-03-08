package com.bananaemperor.homeworksux;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Extra_Message = "text enter or something";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterButton = findViewById(R.id.chromosome_button);
        enterButton.setTransformationMethod(null);
    }


    public void sendMessage (View aView)
    {
        Intent intent = new Intent(this, coolActivity2.class);
        EditText entertext = (EditText) findViewById(R.id.entertext);
        String message = entertext.getText().toString();
        intent.putExtra(Extra_Message, message);
        startActivity(intent);
    }
}