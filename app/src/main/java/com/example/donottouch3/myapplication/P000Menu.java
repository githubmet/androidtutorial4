package com.example.donottouch3.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class P000Menu extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] activityNames=getResources().getStringArray(R.array.activity_names);
        ArrayAdapter arrayAdapter=new ArrayAdapter(P000Menu.this,
                android.R.layout.simple_list_item_1,activityNames);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        try {
            Class classClass=Class.forName("com.example.donottouch3.myapplication."+
                    l.getItemAtPosition(position));
            Intent intent =new Intent(P000Menu.this,classClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
