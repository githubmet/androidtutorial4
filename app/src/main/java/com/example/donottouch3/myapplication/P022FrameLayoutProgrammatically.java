package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;


public class P022FrameLayoutProgrammatically extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout=new FrameLayout(this);
        ImageView imageViewBackgroud=new ImageView(this);
        imageViewBackgroud.setImageResource(R.drawable.sample_4);

        ImageView imageViewLeftArrow=new ImageView(this);
        imageViewLeftArrow.setImageResource(R.drawable.slidersolok_logo);
        FrameLayout.LayoutParams layoutParamsLeft = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER_VERTICAL
        );

        ImageView imageViewRightArrow=new ImageView(this);
        imageViewRightArrow.setImageResource(R.drawable.slidersagok_logo);
        FrameLayout.LayoutParams layoutParamsRight=new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER_VERTICAL | Gravity.RIGHT
        );

        frameLayout.addView(imageViewBackgroud);
        frameLayout.addView(imageViewLeftArrow,layoutParamsLeft);
        frameLayout.addView(imageViewRightArrow,layoutParamsRight);
        setContentView(frameLayout);
    }
}
