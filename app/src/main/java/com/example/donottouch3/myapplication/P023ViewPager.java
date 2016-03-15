package com.example.donottouch3.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.donottouch3.myapplication.adapter.P023PagerAdapter;

public class P023ViewPager extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        ViewPager viewPager=new ViewPager(this);
        PagerAdapter pagerAdapter=new P023PagerAdapter(P023ViewPager.this);
        viewPager.setAdapter(pagerAdapter);
        RelativeLayout.LayoutParams konumViewPager=new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        viewPager.setLayoutParams(konumViewPager);
        relativeLayout.addView(viewPager);
        setContentView(relativeLayout);
    }
}
