package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Random;

public class Subscribe extends AppCompatActivity {

    private String name;
    private Button payment;
    private Intent intent;
    private Spinner secAgency,packages;
    private EditText fullname, startDate, endDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);


        payment = findViewById(R.id.button_payment);
        secAgency = findViewById(R.id.spinner_sec);
        packages = findViewById(R.id.spinner_package);
        fullname = findViewById(R.id.edt_sub_name);

        name = fullname.getText().toString();
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Payment.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        intent = new Intent(getApplicationContext(),HomePage.class);
        startActivity(intent);
        finish();
    }
}
