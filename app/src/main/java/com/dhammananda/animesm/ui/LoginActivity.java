package com.dhammananda.animesm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.helper.ValidationHelper;
import com.dhammananda.animesm.models.User;
import com.dhammananda.animesm.repositories.UserRepository;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputLayout emailInputLayout;
    TextInputLayout passwordInputLayout;
    TextInputEditText textEmailAddress;
    TextInputEditText textPassword;
    AppCompatButton buttonLogin;
    AppCompatButton buttonRegister;

    ValidationHelper validationHelper;
    UserRepository userRepository;

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

        validationHelper = ValidationHelper.getInstance();
        userRepository = UserRepository.getInstance();

        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                onClickLogin();
            case R.id.button_register:
                onClickRegister();
        }
    }

    private void onClickRegister() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private void onClickLogin() {
        String email = Objects.requireNonNull(textEmailAddress.getText()).toString().trim();
        String password = Objects.requireNonNull(textPassword.getText()).toString().trim();

        User user = userRepository.findUserByEmailAddress(email);

        if (validationHelper.isStringEmpty(email)) {
            Toast.makeText(this, "Email must be filled", Toast.LENGTH_SHORT).show();
        } else if (validationHelper.isStringEmpty(password)) {
            Toast.makeText(this, "Password must be filled", Toast.LENGTH_SHORT).show();
        } else if (user == null) {
            Toast.makeText(this, "Account doesn't exists in the database", Toast.LENGTH_SHORT).show();
        } else if (user.getPassword() != password) {
            Toast.makeText(this, "Password doesn't match", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
    }
}
