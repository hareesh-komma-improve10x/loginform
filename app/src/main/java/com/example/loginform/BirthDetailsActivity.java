package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button birtNextBtn = findViewById(R.id.birth_next_btn);
        birtNextBtn.setOnClickListener(view -> {
            EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent intent1 = new Intent(this,ProfessionalInfoActivity.class);
            intent1.putExtras(bundle);
            intent1.putExtra("dateOfBirthTxt", dateOfBirth);
            intent1.putExtra("placeOfBirthTxt", placeOfBirth);
            startActivity(intent1);
        });

        Button birthBackBtn = findViewById(R.id.birth_back_btn);
        birthBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}