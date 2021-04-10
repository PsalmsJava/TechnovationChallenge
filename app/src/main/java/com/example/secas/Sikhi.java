package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sikhi extends AppCompatActivity {

    private TextView response;
    private EditText edt_response;
    private Button button_send;
    String message = "";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikhi);

        response = findViewById(R.id.txt_response);
        edt_response = findViewById(R.id.edt_response);
        button_send = findViewById(R.id.button_chat_sikhi);

        message = "Sikhi Says to use the app, After you have onboarded, \n On the home page click any button to access the menu options.\n if you need to be attended to by a Cuustomer care agent \n" +
                "send a mail to secas@app.me";

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_response.getText().toString().equals("1")){
                    response.setText(message);
                    edt_response.setText("");
                }
                else if(edt_response.getText().toString().equals("2")){
                    intent = new Intent(getApplicationContext(),ViewAgencies.class);
                    startActivity(intent);
                    finish();
                }
                else if(edt_response.getText().toString().equals("3")){
                    intent = new Intent(getApplicationContext(),Subscribe.class);
                    startActivity(intent);
                    finish();
                }
                else if(edt_response.getText().toString().equals("4")){
                    intent = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(intent);
                    finish();
                }else{
                    message = "Sikhi says you have selected an unavailable option";
                    response.setText(message);
                    edt_response.setText("");
                }
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
