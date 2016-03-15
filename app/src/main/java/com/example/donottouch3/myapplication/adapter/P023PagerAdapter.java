package com.example.donottouch3.myapplication.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.donottouch3.myapplication.R;

public class P023PagerAdapter extends PagerAdapter {
    Context context;
    int[] colorDizi;
    TypedArray typedArray;
    public P023PagerAdapter(Context context) {
        this.context=context;
        typedArray= context.getResources().obtainTypedArray(R.array.string_image_id_);
        colorDizi= context.getResources().getIntArray(R.array.integer_color_id);
    }

    @Override
    public int getCount() { //bela
        return colorDizi.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) { //bela2
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        FrameLayout frameLayout=new FrameLayout(context);
        frameLayout.setBackgroundColor(colorDizi[position]);

        ImageView imageViewBackgroud=new ImageView(context);
        imageViewBackgroud.setImageResource(typedArray.getResourceId(position,0));

        ImageView imageViewLeftArrow=new ImageView(context);
        imageViewLeftArrow.setImageResource(R.drawable.slidersolok_logo);
        FrameLayout.LayoutParams layoutParamsLeft = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER_VERTICAL
        );

        ImageView imageViewRightArrow=new ImageView(context);
        imageViewRightArrow.setImageResource(R.drawable.slidersagok_logo);
        FrameLayout.LayoutParams layoutParamsRight=new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER_VERTICAL | Gravity.RIGHT
        );

        frameLayout.addView(imageViewBackgroud);
        if(position!=0)//check
        frameLayout.addView(imageViewLeftArrow,layoutParamsLeft);
        if(position!=colorDizi.length-1) //check
        frameLayout.addView(imageViewRightArrow,layoutParamsRight);


        container.addView(frameLayout);  // This is different

        return frameLayout;  //Watch out you return a Layout
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
         container.removeView((FrameLayout)object);
    }
}
