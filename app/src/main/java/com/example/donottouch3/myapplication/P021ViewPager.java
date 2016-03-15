package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.support.v4.view.ViewPager;

import com.example.donottouch3.myapplication.adapter.P021PagerAdapter;

public class P021ViewPager extends Activity implements View.OnClickListener {
    ViewPager viewPagerP021;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p021viewpager);
        findViewById(R.id.buttonP021).setOnClickListener(this);
        viewPagerP021=(ViewPager)findViewById(R.id.viewPagerP021);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonP021){
            PagerAdapter pagerAdapter= new P021PagerAdapter(P021ViewPager.this);
            viewPagerP021.setAdapter(pagerAdapter);
        }
    }
}
