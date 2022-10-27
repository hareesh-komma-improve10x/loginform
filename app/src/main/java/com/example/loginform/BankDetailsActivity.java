package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String emailAddress = intent.getStringExtra("emailAddress");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //String companyName = intent.getStringExtra("companyName");
        //String totalExperience = intent.getStringExtra("totalExperience");
        //String designation = intent.getStringExtra("designation");
        //Toast.makeText(this, emailAddress + " " + password + " " + confirmPassword + " " +userName + " " + firstName + " " + lastName + " " + companyName + " " + totalExperience + " " + designation + " ", Toast.LENGTH_SHORT).show();

        Button bankNextBtn = findViewById(R.id.bank_next_btn);
        bankNextBtn.setOnClickListener(view -> {
            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankName = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
            String accountHolderName = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.account_number_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText iFSCCodeTxt = findViewById(R.id.ifsc_code_txt);
            String iFSCCode = iFSCCodeTxt.getText().toString();
            Intent successIntent = new Intent(this,CreditCardDetailsActivity.class);
            //successIntent.putExtra("emailAddress", emailAddress);
            //successIntent.putExtra("password", password);
            //successIntent.putExtra("confirmPassword", confirmPassword);
            //successIntent.putExtra("userName", userName);
            //successIntent.putExtra("firstName", firstName);
            //successIntent.putExtra("lastName", lastName);
            //successIntent.putExtra("companyName", companyName);
            //successIntent.putExtra("totalExperience", totalExperience);
            //successIntent.putExtra("designation", designation);
            successIntent.putExtras(bundle);
            successIntent.putExtra("bankName", bankName);
            successIntent.putExtra("accountHolderName", accountHolderName);
            successIntent.putExtra("accountNumber", accountNumber);
            successIntent.putExtra("iFSCCode", iFSCCode);
            startActivity(successIntent);
        });

        Button bankBackBtn = findViewById(R.id.bank_back_btn);
        bankBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}