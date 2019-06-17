package com.example.donottouch3.myapplication.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class P000BaseAdapter extends BaseAdapter {
    Context context;
    String[] numbers;
    public P000BaseAdapter(Context context) {
        this.context=context;

        numbers =new String[]{"0","1","2","3","4","5","6","7","8","9",
                "00","11","22","33","44","55","66","77","88","99",
                "000","111","222","333","444","555","666","777","888","999",
                "0000","1111","2222","3333","4444","5555","6666","7777","8888","9999"};

    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int position) {
        return numbers[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if(convertView==null){
            textView=new TextView(context);
            textView.setText(numbers[position].toString());
        }
        else{
            textView=(TextView)convertView;
        }
        return textView;
    }
}
