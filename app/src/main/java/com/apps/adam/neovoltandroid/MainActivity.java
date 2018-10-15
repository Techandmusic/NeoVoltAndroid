package com.apps.adam.neovoltandroid;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.pager) ViewPager viewPage;
    @BindView(R.id.tabs) TabLayout tabLayout;
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        //Create the PagerAdapter
        PagerAdapter pagerAdapter = new NeoVoltPagerAdapter(this, getSupportFragmentManager());
        if (viewPage == null) {
            Log.e(LOG_TAG, "ViewPager is null");
        }
        //Set the PagerAdapter to the ViewPager
        viewPage.setAdapter(pagerAdapter);
        //Call the setUpWithViewPager method to connect TabLayout automatically
        tabLayout.setupWithViewPager(viewPage);
    }
}
