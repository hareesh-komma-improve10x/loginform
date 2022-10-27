package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button identityNextBtn = findViewById(R.id.identity_next_btn);
        identityNextBtn.setOnClickListener(view -> {
            EditText panNumberTxt = findViewById(R.id.pan_number_txt);
            String panNumber = panNumberTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
            String aadharNumber = aadharNumberTxt.getText().toString();
            Intent successIntent = new Intent(this,SuccessActivity.class);
            successIntent.putExtras(bundle);
            successIntent.putExtra("panNumber", panNumber);
            successIntent.putExtra("aadharNumber", aadharNumber);
            startActivity(successIntent);
        });

        Button identityBackBtn = findViewById(R.id.identity_back_btn);
        identityBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}