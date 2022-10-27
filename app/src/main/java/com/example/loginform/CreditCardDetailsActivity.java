package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button creditCardNextBtn = findViewById(R.id.credit_card_next_btn);
        creditCardNextBtn.setOnClickListener(view -> {
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expireTxt = findViewById(R.id.expire_txt);
            String expire = expireTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent identityIntent = new Intent(this,IdentityActivity.class);
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("cardNumber", cardNumber);
            identityIntent.putExtra("cardHolder", cardHolder);
            identityIntent.putExtra("expire", expire);
            identityIntent.putExtra("cvv", cvv);
            startActivity(identityIntent);
        });

        Button creditCardBackBtn = findViewById(R.id.credit_card_back_btn);
        creditCardBackBtn.setOnClickListener(view -> {
            finish();
        });

    }
}