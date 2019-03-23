package com.dhammananda.animesm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dhammananda.animesm.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputLayout emailInputLayout;
    TextInputLayout passwordInputLayout;
    TextInputEditText textEmailAddress;
    TextInputEditText textPassword;
    AppCompatButton buttonLogin;
    AppCompatButton buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailInputLayout = findViewById(R.id.email_input_layout);
        passwordInputLayout = findViewById(R.id.password_input_layout);
        textEmailAddress = findViewById(R.id.edit_text_email_address);
        textPassword = findViewById(R.id.edit_text_password);
        buttonLogin = findViewById(R.id.button_login);
        buttonRegister = findViewById(R.id.button_register);

        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            case R.id.button_register:
        }
    }
}
