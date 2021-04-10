package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    private Button submit_feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        submit_feedback = findViewById(R.id.button_submit_feedback);
        submit_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Feedback.this, "Your Feedback Has been Sent, We will Update Ratings Based on This", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),HomePage.class);
        startActivity(intent);
        finish();
    }
}
