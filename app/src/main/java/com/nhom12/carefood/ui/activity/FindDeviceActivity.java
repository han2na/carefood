package com.nhom12.carefood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nhom12.carefood.R;

public class FindDeviceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_find_device;
    }

    public void connectingActivity(View view) {
        startActivity(new Intent(FindDeviceActivity.this, ConnectingDeviceActivity.class));
    }
}