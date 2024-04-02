package com.nhom12.carefood.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nhom12.carefood.R;

public class Choose_goal extends AppCompatActivity {
    TextView seeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_goal);
        seeView = findViewById(R.id.see_static);
        seeView.setOnClickListener(view -> {
            Intent i = new Intent(Choose_goal.this, Statitic.class);
            startActivity(i);
        });
    }
}