package com.nhom12.carefood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.nhom12.carefood.R;

public class Weekly_menu extends AppCompatActivity {
    TextView full_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_menu);
        full_menu = findViewById(R.id.full_menu);
        full_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Weekly_menu.this, MenuDetail.class);
                startActivity(i);
            }
        });
    }
}