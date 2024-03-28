package com.nhom12.carefood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nhom12.carefood.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_register;
    }

    public void authenActivity(View view) {
        startActivity(new Intent(RegisterActivity.this, AuthenticationActivity.class));
    }

    public void loginAccount(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }
}