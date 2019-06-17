package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.donottouch3.myapplication.adapter.P000BaseAdapter;

public class P000GridView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p000_gridview);

        GridView gridViewP000= findViewById(R.id.gridViewP000);
        P000BaseAdapter p000BaseAdapter=new P000BaseAdapter(this);
        gridViewP000.setAdapter(p000BaseAdapter);
    }
}
