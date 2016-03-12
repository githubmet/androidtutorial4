package com.example.donottouch3.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.donottouch3.myapplication.R;

public class P018RecyclerViewAdapter extends RecyclerView.Adapter<P018RecyclerViewAdapter.MyViewHolderP018> {
    LayoutInflater layoutInflater;
    String[] stringDizi;
    public P018RecyclerViewAdapter(Context context, String... stringDizi) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context
                .LAYOUT_INFLATER_SERVICE);
        this.stringDizi=stringDizi;

    }

    @Override
    public P018RecyclerViewAdapter.MyViewHolderP018 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.p018customrow,parent,false);
        MyViewHolderP018 myViewHolderP018=new MyViewHolderP018(view);

        return myViewHolderP018;
    }

    @Override
    public void onBindViewHolder(P018RecyclerViewAdapter.MyViewHolderP018 holder, int position) {
        holder.textViewCustomRowP018.setText(stringDizi[position]);
    }

    @Override
    public int getItemCount() {
        return stringDizi.length;
    }
    public class MyViewHolderP018 extends RecyclerView.ViewHolder{
        TextView textViewCustomRowP018;
        public MyViewHolderP018(View itemView) {
            super(itemView);
            textViewCustomRowP018= (TextView)itemView.findViewById(R.id.textViewCustomRowP018);
        }
    }
}
