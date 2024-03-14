package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        VIewPagerAdapter adapter = new VIewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);  //sets adapter on the viewPager
        tab.setupWithViewPager(viewPager); //sets viewPager on the tabLayout
    }
}