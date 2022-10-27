package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String emailAddress = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //Toast.makeText(this, emailAddress + " " + password + " " + confirmPassword, Toast.LENGTH_SHORT).show();
        Button next2Btn = findViewById(R.id.next_2_btn);
        next2Btn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.user_name_txt);
            String userName2 = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.first_name_txt);
            String firstName2 = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.last_name_txt);
            String lastName2 = lastNameTxt.getText().toString();
            Intent professionalIntent = new Intent(this,AddressActivity.class);
            //professionalIntent.putExtra("emailAddress", emailAddress);
            //professionalIntent.putExtra("password", password);
            //professionalIntent.putExtra("confirmPassword", confirmPassword);
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("userName", userName2);
            professionalIntent.putExtra("firstName", firstName2);
            professionalIntent.putExtra("lastName", lastName2);
            startActivity(professionalIntent);
        });

        Button back1Btn = findViewById(R.id.back_1_btn);
        back1Btn.setOnClickListener(view -> {
            finish();
        });
    }
}