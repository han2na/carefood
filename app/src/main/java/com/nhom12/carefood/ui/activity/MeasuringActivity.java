package com.nhom12.carefood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.nhom12.carefood.R;

public class MeasuringActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(this::staticMeasuring, 2000);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_measuring;
    }

    public void staticMeasuring() {
        startActivity(new Intent(MeasuringActivity.this, ResultMeasuringActivity.class));
    }
}