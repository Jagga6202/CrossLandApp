package com.example.crossland.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.crossland.R;

public class RegisterActivity extends AppCompatActivity {
    Button register;
    EditText name, mobile , email, quali,city;
    Boolean CheckEditText ;
    Spinner interest,country;
    String NameHolder, EmailHolder, MobileHolder ,QualiHolder,CityHolder,InterestHolder,CountryHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = (Button)findViewById(R.id.register);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        mobile = (EditText)findViewById(R.id.mobile);
        quali = (EditText)findViewById(R.id.quali);
        city = (EditText) findViewById(R.id.city);
        interest = (Spinner) findViewById(R.id.interest);
        country = (Spinner) findViewById(R.id.country);
        final String[] intre=getResources().getStringArray(R.array.interest);
        final String[] coun=getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, intre);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        interest.setAdapter(adapter);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,coun);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(adapter1);

        interest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                InterestHolder=intre[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryHolder=coun[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetCheckEditTextIsEmptyOrNot();
                if(CheckEditText){
                    //registerUser(NameHolder,CityHolder,MobileHolder,EmailHolder,QualiHolder,InterestHolder,CountryHolder);
                    Intent intent = new Intent(RegisterActivity.this, VerifyPhoneActivity.class);
                    intent.putExtra("name",NameHolder);
                    intent.putExtra("city",CityHolder);
                    intent.putExtra("mobile",MobileHolder);
                    intent.putExtra("email",EmailHolder);
                    intent.putExtra("quali",QualiHolder);
                    intent.putExtra("interest",InterestHolder);
                    intent.putExtra("country",CountryHolder);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    startActivity(intent);
                }
                else {
                    Toast.makeText(RegisterActivity.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void GetCheckEditTextIsEmptyOrNot(){
        NameHolder = name.getText().toString();
        EmailHolder = email.getText().toString();
        MobileHolder = mobile.getText().toString();
        QualiHolder = quali.getText().toString();
        CityHolder = city.getText().toString();
        if(TextUtils.isEmpty(NameHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(MobileHolder)
                ||TextUtils.isEmpty(QualiHolder) ||TextUtils.isEmpty(CityHolder))
        {
            CheckEditText = false;
        }
        else {

            CheckEditText = true ;
        }
    }



}
