package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String emailAddress = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //Toast.makeText(this, emailAddress + " " + password + " " + confirmPassword + " " +userName + " " + firstName + " " + lastName, Toast.LENGTH_SHORT).show();

        Button next3Btn = findViewById(R.id.next_3_btn);
        next3Btn.setOnClickListener(view -> {
            EditText companyNameTxt = findViewById(R.id.company_name_txt);
            String companyName = companyNameTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            Intent bankIntent = new Intent(this, BankDetailsActivity.class);
            //bankIntent.putExtra("emailAddress", emailAddress);
            //bankIntent.putExtra("password", password);
            //bankIntent.putExtra("confirmPassword", confirmPassword);
            //bankIntent.putExtra("userName", userName);
            //bankIntent.putExtra("firstName", firstName);
            //bankIntent.putExtra("lastName", lastName);
            bankIntent.putExtras(bundle);
            bankIntent.putExtra("companyName", companyName);
            bankIntent.putExtra("totalExperience", totalExperience);
            bankIntent.putExtra("designation", designation);
            startActivity(bankIntent);
        });

        Button back2Btn = findViewById(R.id.back_2_btn);
        back2Btn.setOnClickListener(view -> {
            finish();
        });
    }
}