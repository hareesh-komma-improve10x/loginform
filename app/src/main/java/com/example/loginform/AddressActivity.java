package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button addressNextBtn = findViewById(R.id.address_next_btn);
        addressNextBtn.setOnClickListener(view -> {
            EditText houseNumberTxt = findViewById(R.id.house_number_txt);
            String houseNumber = houseNumberTxt.getText().toString();
            EditText streetNameTxt = findViewById(R.id.street_name_txt);
            String streetName = streetNameTxt.getText().toString();
            EditText cityNameTxt = findViewById(R.id.city_name_txt);
            String cityName = cityNameTxt.getText().toString();
            EditText stateNameTxt = findViewById(R.id.state_name_txt);
            String stateName = stateNameTxt.getText().toString();
            EditText countryNameTxt = findViewById(R.id.country_name_txt);
            String countryName = countryNameTxt.getText().toString();
            Intent birthIntent = new Intent(this,BirthDetailsActivity.class);
            birthIntent.putExtras(bundle);
            birthIntent.putExtra("houseNumber", houseNumber);
            birthIntent.putExtra("streetName", streetName);
            birthIntent.putExtra("cityName", cityName);
            birthIntent.putExtra("stateName", stateName);
            birthIntent.putExtra("countryName", countryName);
            startActivity(birthIntent);
        });

        Button addressBackBtn = findViewById(R.id.address_back_btn);
        addressBackBtn.setOnClickListener(view -> {
            finish();
        });

    }
}