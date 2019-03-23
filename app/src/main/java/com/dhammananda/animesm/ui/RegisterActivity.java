package com.dhammananda.animesm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dhammananda.animesm.R;
import com.dhammananda.animesm.helper.ValidationHelper;
import com.dhammananda.animesm.models.User;
import com.dhammananda.animesm.repositories.UserRepository;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputEditText usernameEditText;
    TextInputEditText passwordEditText;
    TextInputEditText confirmPasswordEditText;
    TextInputEditText phoneNumberEditText;
    TextInputEditText emailEditText;
    TextInputEditText addressEditText;
    AppCompatButton buttonRegisterEditText;

    UserRepository userRepository;
    ValidationHelper validationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameEditText = findViewById(R.id.edit_text_username);
        passwordEditText = findViewById(R.id.edit_text_password);
        confirmPasswordEditText = findViewById(R.id.edit_text_confirm_password);
        phoneNumberEditText = findViewById(R.id.edit_text_phone_number);
        emailEditText = findViewById(R.id.edit_text_email);
        addressEditText = findViewById(R.id.edit_text_address);
        buttonRegisterEditText = findViewById(R.id.button_submit_register);

        userRepository = UserRepository.getInstance();
        validationHelper = ValidationHelper.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_submit_register:
                onClickRegister();
        }
    }

    private void onClickRegister() {
        String username = Objects.requireNonNull(usernameEditText.getText()).toString().trim();
        String password = Objects.requireNonNull(passwordEditText.getText()).toString().trim();
        String confirmPassword = Objects.requireNonNull(confirmPasswordEditText.getText()).toString().trim();
        String phoneNumber = Objects.requireNonNull(phoneNumberEditText.getText()).toString().trim();
        String email = Objects.requireNonNull(emailEditText.getText()).toString().trim();
        String address = Objects.requireNonNull(addressEditText.getText()).toString().trim();

        if (validationHelper.isStringEmpty(username)) {
            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
        } else if (validationHelper.isStringEmpty(password)) {
            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
        } else if (validationHelper.isStringEmpty(confirmPassword)) {
            Toast.makeText(this, "Confirm password is required", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "Password and confirm password is required", Toast.LENGTH_SHORT).show();
        } else {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setAddress(address);
            user.setEmail(email);
            user.setPhoneNumber(phoneNumber);
            userRepository.save(user);

            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

}
