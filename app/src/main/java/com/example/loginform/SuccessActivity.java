package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String companyName = intent.getStringExtra("companyName");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolderName = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String iFSCCode = intent.getStringExtra("iFSCCode");
        String dateOfBirth = intent.getStringExtra("dateOfBirthTxt");
        String placeOfBirth = intent.getStringExtra("placeOfBirthTxt");
        String panNumber = intent.getStringExtra("panNumber");
        String aadharNumber = intent.getStringExtra("aadharNumber");
        String houseNumber = intent.getStringExtra("houseNumber");
        String streetName = intent.getStringExtra("streetName");
        String cityName = intent.getStringExtra("cityName");
        String stateName = intent.getStringExtra("stateName");
        String countryName = intent.getStringExtra("countryName");
        String cardNumber = intent.getStringExtra("cardNumber");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expire = intent.getStringExtra("expire");
        String cvv = intent.getStringExtra("cvv");


        //Toast.makeText(this, emailAddress + " " + password + " " + confirmPassword + " " + userName + " " + firstName + " " + lastName + " " + bankName + " " + accountHolderName + " " + accountNumber + " " + iFSCCode, Toast.LENGTH_SHORT).show();

        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(emailAddress);
        //TextView passwordTxt = findViewById(R.id.password_txt);
        //passwordTxt.setText(password);
        //TextView confirmPasswordTxt = findViewById(R.id.confirm_password_txt);
        //confirmPasswordTxt.setText(confirmPassword);
        TextView successUserNameTxt = findViewById(R.id.success_user_name_txt);
        successUserNameTxt.setText(userName);
        TextView successFirstNameTxt = findViewById(R.id.success_first_name_txt);
        successFirstNameTxt.setText(firstName);
        TextView successLastNameTxt = findViewById(R.id.success_last_name_txt);
        successLastNameTxt.setText(lastName);
        TextView currentCompanyNameTxt = findViewById(R.id.current_company_name_txt);
        currentCompanyNameTxt.setText(companyName);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText(totalExperience);
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bank_name_txt);
        bankNameTxt.setText(bankName);
        TextView bankAccountHolderTxt = findViewById(R.id.bank_account_holder_txt);
        bankAccountHolderTxt.setText(accountHolderName);
        TextView bankAccountNumberTxt = findViewById(R.id.bank_account_number_txt);
        bankAccountNumberTxt.setText(accountNumber);
        TextView bankIFSCCodeTxt = findViewById(R.id.bank_ifsc_code_txt);
        bankIFSCCodeTxt.setText(iFSCCode);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        //TextView panNumberTxt = findViewById(R.id.pan_number_txt);
        //panNumberTxt.setText(panNumber);
        //TextView aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
        //aadharNumberTxt.setText(aadharNumber);
        TextView panNumberTxt1 = findViewById(R.id.pan_number_txt1);
        panNumberTxt1.setText(panNumber);
        TextView aadharNumberTxt1 = findViewById(R.id.aadhar_number_txt1);
        aadharNumberTxt1.setText(aadharNumber);
        TextView apartmentNumberTxt = findViewById(R.id.apartment_number_txt);
        apartmentNumberTxt.setText(houseNumber);
        TextView streetNameTxt1 = findViewById(R.id.street_name_txt1);
        streetNameTxt1.setText(streetName);
        TextView cityNameTxt1 = findViewById(R.id.city_name_txt1);
        cityNameTxt1.setText(cityName);
        TextView stateNameTxt1 = findViewById(R.id.state_name_txt1);
        stateNameTxt1.setText(stateName);
        TextView countryNameTxt1 = findViewById(R.id.country_name_txt1);
        countryNameTxt1.setText(countryName);
        TextView cardNumberTxt1 = findViewById(R.id.card_Number_txt1);
        cardNumberTxt1.setText(cardNumber);
        TextView cardHolderTxt1 = findViewById(R.id.card_holder_txt1);
        cardHolderTxt1.setText(cardHolder);
        TextView expireTxt1 = findViewById(R.id.expire_txt1);
        expireTxt1.setText(expire);
        TextView cvvTxt1 = findViewById(R.id.cvv_txt1);
        cvvTxt1.setText(cvv);
    }
}