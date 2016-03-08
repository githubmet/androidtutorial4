package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.donottouch3.myapplication.adapter.P007BaseAdapter;

public class P007GridView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007gridview);

        GridView gridViewP007=(GridView)findViewById(R.id.gridViewP007);
        P007BaseAdapter p007BaseAdapter=new P007BaseAdapter(P007GridView.this);
        gridViewP007.setAdapter(p007BaseAdapter);

        gridViewP007.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast toast = Toast.makeText(P007GridView.this,
                                "position=" + position, Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.LEFT|Gravity.TOP,0,0);
                        toast.show();

                    }
                }
        );
    }
}
