package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Developer_Activity extends AppCompatActivity {

    Button btnRestart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        btnRestart = (Button) findViewById(R.id.button4);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in2);
            }
        });
    }
}