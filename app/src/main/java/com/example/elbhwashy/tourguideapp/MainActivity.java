package com.example.elbhwashy.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  find the viewpager in the main activity */
        ViewPager viewPager= (ViewPager)findViewById(R.id.viewpager);

        /*create an adapter which fragment shown in each page */
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

/* set the adapter onto the view pager */
        viewPager.setAdapter(adapter);

        /* find the tab layout to set the tabs  */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        /*  Connect the tab layout with the view pager */
        tabLayout.setupWithViewPager(viewPager);

    }
}
