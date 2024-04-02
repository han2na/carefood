package com.nhom12.carefood.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nhom12.carefood.R;

public class Recommend_menu extends AppCompatActivity {
    CardView cardView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_menu);
        intit();
        cardView1.setOnClickListener(view -> {
            Intent i = new Intent(Recommend_menu.this, Weekly_menu.class);
            startActivity(i);
        });

    }

    private void intit() {
        cardView1 = findViewById(R.id.card1);
    }
}