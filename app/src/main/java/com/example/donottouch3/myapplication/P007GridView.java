package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.donottouch3.myapplication.adapter.P007BaseAdapter;

public class P007GridView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007gridview);

        GridView gridViewP007=(GridView)findViewById(R.id.gridViewP007);
        P007BaseAdapter p007BaseAdapter=new P007BaseAdapter(P007GridView.this);
        gridViewP007.setAdapter(p007BaseAdapter);
    }
}
