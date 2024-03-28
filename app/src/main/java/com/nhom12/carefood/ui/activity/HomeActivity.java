package com.nhom12.carefood.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.nhom12.carefood.R;
import com.nhom12.carefood.ui.fragment.ChartFragment;
import com.nhom12.carefood.ui.fragment.HeartFragment;
import com.nhom12.carefood.ui.fragment.HomeFragment;
import com.nhom12.carefood.ui.fragment.MenuFragment;
import com.nhom12.carefood.ui.fragment.UserFragment;

public class HomeActivity extends BaseActivity {
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selected_Fragment = null;
            if (item.getItemId() == R.id.navigation_home) {
                selected_Fragment = new HomeFragment();
            } else if (item.getItemId() == R.id.navigation_user) {
                selected_Fragment = new UserFragment();
            } else if (item.getItemId() == R.id.navigation_chart) {
                selected_Fragment = new ChartFragment();
            } else if (item.getItemId() == R.id.navigation_heart) {
                selected_Fragment = new HeartFragment();
            } else if (item.getItemId() == R.id.navigation_menu) {
                selected_Fragment = new MenuFragment();
            }
            if (selected_Fragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, selected_Fragment).commit();
            }
            return true;
        });
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_home;
    }
}