package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button subscibe, viewAgencies,  humaans;
    private Button feedback;
    private Button about,sikhi;
    private Intent  intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        subscibe = findViewById(R.id.button_subscribe);
        viewAgencies = findViewById(R.id.button_viewagencies);
        humaans = findViewById(R.id.button_humaans);
        feedback = findViewById(R.id.button_feedback);
        about = findViewById(R.id.button_about);
        sikhi = findViewById(R.id.sikhi);

        sikhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Sikhi.class);
                startActivity(intent);
                finish();
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Feedback.class);
                startActivity(intent);
                finish();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),About.class);
                startActivity(intent);
                finish();
            }
        });

        humaans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Humaans.class);
                startActivity(intent);
                finish();
            }
        });

        subscibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Subscribe.class);
                startActivity(intent);
                finish();
            }
        });

        viewAgencies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),ViewAgencies.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
