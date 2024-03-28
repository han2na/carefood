package com.nhom12.carefood.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.nhom12.carefood.R;

public class ConnectingDeviceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(this::connectedActivity, 2000);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_connecting_device;
    }

    private void connectedActivity() {
        startActivity(new Intent(ConnectingDeviceActivity.this, ConnectedDeviceActivity.class));
    }
}