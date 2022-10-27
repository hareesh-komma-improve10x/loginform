package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpINFO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_info);
        Button next1Btn = findViewById(R.id.next_1_btn);
        next1Btn.setOnClickListener(view -> {
            Intent intent = new Intent(this,PersonalInfoActivity.class);
            EditText emailAddressTxt = findViewById(R.id.email_address_txt);
            String emailAddress = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.conform_password_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            intent.putExtra("emailAddress", emailAddress);
            intent.putExtra("password", password);
            intent.putExtra("confirmPassword", confirmPassword);
            startActivity(intent);
        });
    }
}