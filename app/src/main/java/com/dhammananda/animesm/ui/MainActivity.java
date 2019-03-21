package com.dhammananda.animesm.ui;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.dhammananda.animesm.MyApplication;
import com.dhammananda.animesm.R;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication())
                .getApplicationComponent()
                .inject(this);
    }

}
