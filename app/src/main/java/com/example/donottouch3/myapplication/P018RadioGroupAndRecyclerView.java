package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.donottouch3.myapplication.adapter.P018RecyclerViewAdapter;

import java.util.List;

public class P018RadioGroupAndRecyclerView extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p018radiogroupandrecyclerview);

        findViewById(R.id.radioButtonLeftP018).setOnClickListener(this);
        findViewById(R.id.radioButtonRightP018).setOnClickListener(this);

        RecyclerView recyclerViewP018=(RecyclerView)findViewById(R.id.recyclerViewP018);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(
                P018RadioGroupAndRecyclerView.this,LinearLayoutManager.VERTICAL,false
        );
        recyclerViewP018.setLayoutManager(linearLayoutManager);
        String[] stringDizi=getResources().getStringArray(R.array.activity_names);

        RecyclerView.Adapter adapter=new P018RecyclerViewAdapter(P018RadioGroupAndRecyclerView.this,
                stringDizi);
        recyclerViewP018.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.radioButtonLeftP018:
                Toast.makeText(P018RadioGroupAndRecyclerView.this,"LinearLayoutManager",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButtonRightP018:
                Toast.makeText(P018RadioGroupAndRecyclerView.this,"GridLayoutManager",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
