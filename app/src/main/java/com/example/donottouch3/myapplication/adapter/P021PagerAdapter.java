package com.example.donottouch3.myapplication.adapter;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.donottouch3.myapplication.R;

public class P021PagerAdapter extends PagerAdapter{

    Context context;
    String[] countryNames;
    int[] colorDizi;
    public P021PagerAdapter(Context context) {
        this.context=context;
        countryNames= context.getResources().getStringArray(R.array.country_names);
        colorDizi=context.getResources().getIntArray(R.array.integer_color_id);
    }

    @Override
    public int getCount() { //mbela
        return countryNames.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) { //mbela2
        return view==object;  //It is too complicated to solve for me now
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //create layout programmatically
        LinearLayout linearLayout=new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(colorDizi[position]);

        LinearLayout.LayoutParams konumLinearLayout=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(konumLinearLayout);

        TextView textView=new TextView(context);
        textView.setText(countryNames[position]);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#FFFFFF"));

        linearLayout.addView(textView);
        container.addView(linearLayout);

        return linearLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}












/*

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.graphics.Typeface;

public class P021PagerAdapter extends PagerAdapter {


    int NumberOfPages = 5;
    int[] res = {
            android.R.drawable.ic_dialog_alert,
            android.R.drawable.ic_menu_camera,
            android.R.drawable.ic_menu_compass,
            android.R.drawable.ic_menu_directions,
            android.R.drawable.ic_menu_gallery};
    int[] backgroundcolor = {
            0xFF101010,
            0xFF202020,
            0xFF303030,
            0xFF404040,
            0xFF505050};
    Context context;
    public P021PagerAdapter(Context context) {
        this.context=context;
    }
    @Override
    public int getCount() {
        return NumberOfPages;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        TextView textView = new TextView(context);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(30);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(String.valueOf(position));

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(res[position]);
        LayoutParams imageParams = new LayoutParams(
                LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(imageParams);

        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams layoutParams = new LayoutParams(
                LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        layout.setBackgroundColor(backgroundcolor[position]);
        layout.setLayoutParams(layoutParams);
        layout.addView(textView);
        layout.addView(imageView);

        final int page = position;
        layout.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(context,
                        "Page " + page + " clicked",
                        Toast.LENGTH_LONG).show();
            }});

        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}

*/
