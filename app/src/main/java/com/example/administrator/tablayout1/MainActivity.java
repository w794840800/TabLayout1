package com.example.administrator.tablayout1;

import android.app.*;
import android.app.ListFragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.table);
        tabLayout.addTab(tabLayout.newTab().setText("wang"));
        tabLayout.addTab(tabLayout.newTab().setText("lei"));
        tabLayout.addTab(tabLayout.newTab().setText("hao"));
        tabLayout.addTab(tabLayout.newTab().setText("wang"));
        List<android.support.v4.app.Fragment> fragments = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            fragments.add(new com.example.administrator.tablayout1.ListFragment());
        }
        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);
      //  tabLayout.setTabsFromPagerAdapter(fragmentAdapter);
    }
}
