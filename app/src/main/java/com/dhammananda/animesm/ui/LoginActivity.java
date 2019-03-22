package com.dhammananda.animesm.ui;

import android.os.Bundle;

import com.dhammananda.animesm.MyApplication;
import com.dhammananda.animesm.R;
import com.dhammananda.animesm.helper.ValidationHelper;
import com.dhammananda.animesm.models.User;
import com.dhammananda.animesm.repositories.UserRepository;

import java.util.List;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Inject
    List<User> users;

    @Inject
    ValidationHelper validation;

    @Inject
    UserRepository userRepository;

    @BindView(R.id.edit_text_email_address)
    AppCompatEditText editTextEmailAddress;

    @BindView(R.id.edit_text_password)
    AppCompatEditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((MyApplication) getApplication())
                .getApplicationComponent()
                .inject(this);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_login)
    public void onClickLogin() {
    }

}
