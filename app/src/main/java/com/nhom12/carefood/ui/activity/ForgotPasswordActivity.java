package com.nhom12.carefood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.nhom12.carefood.R;

public class ForgotPasswordActivity extends BaseActivity {
    LinearLayout ll;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll = findViewById(R.id.ll_accept_auth);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_forgot_password;
    }

    public void nextAuthen(View view) {
        ll.setVisibility(View.VISIBLE);
    }

    public void acceptAuthen(View view) {
        startActivity(new Intent(ForgotPasswordActivity.this, HomeActivity.class));
    }
}