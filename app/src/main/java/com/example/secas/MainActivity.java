package com.example.secas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText username, password;
    private TextView register;
    private Intent intent;
    private ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.button_login);
        username = findViewById(R.id.editext_username);
        password = findViewById(R.id.editext_password);
        register = findViewById(R.id.textview_register);
        imageView = findViewById(R.id.img_call);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    intent = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(intent);
                    finish();
                }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
                finish();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri emergencyNumber = Uri.parse("tel:119");
                intent = new Intent(Intent.ACTION_CALL,emergencyNumber);
                startActivity(intent);

            }
        });


    }
}
