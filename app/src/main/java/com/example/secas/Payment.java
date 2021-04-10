package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Payment extends AppCompatActivity {


    private TextView clientName, subPackage, transId, cost,agencyName;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        clientName = findViewById(R.id.txt_client_name);
        transId = findViewById(R.id.txt_transaction_id);
        cost = findViewById(R.id.txt_total_amount);

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create random string builder
        StringBuilder sb = new StringBuilder();
        // create an object of Random class
        Random random = new Random();
        // specify length of random string
        int length = 10;

        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());
            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }

        final String randomString = sb.toString();


        clientName.setText("Psalms E Inyang");
        transId.setText(randomString);
        cost.setText("65,000:00 NGN");

    }
}
