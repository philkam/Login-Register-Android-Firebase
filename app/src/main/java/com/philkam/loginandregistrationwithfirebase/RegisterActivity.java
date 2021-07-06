package com.philkam.loginandregistrationwithfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText EditTextEmail;
    private EditText EditTextPassword;
    private Button BtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditTextEmail = findViewById(R.id.editTextEmailAddress);
        EditTextPassword = findViewById(R.id.editTextPassword);
        BtnRegister = findViewById(R.id.register);


    }
}