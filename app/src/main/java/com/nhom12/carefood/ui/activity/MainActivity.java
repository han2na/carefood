package com.nhom12.carefood.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.nhom12.carefood.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }

    public void registerAccount(View view) {
        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
    }

    public void loginAccount(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

}