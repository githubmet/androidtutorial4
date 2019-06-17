package com.example.donottouch3.myapplication;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewAnimator;

public class P016ViewAnimator extends Activity implements View.OnClickListener{
    ViewAnimator viewAnimator;
    boolean checkKontrol;
    ViewAnimator viewAnimator2P016;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p016viewanimator);

        viewAnimator=(ViewAnimator)findViewById(R.id.viewAnimatorP016);

        Animation animationInLeft= AnimationUtils.loadAnimation(
                P016ViewAnimator.this,android.R.anim.slide_in_left); //Please, trust your insight.
        Animation animatorInRight= AnimationUtils.loadAnimation(
                P016ViewAnimator.this,android.R.anim.slide_out_right);
        viewAnimator.setInAnimation(animationInLeft);
        viewAnimator.setOutAnimation(animatorInRight);

        viewAnimator.setOnClickListener(this);
        findViewById(R.id.buttonFirstP016).setOnClickListener(this);
        findViewById(R.id.buttonSecondP016).setOnClickListener(this);

        viewAnimator2P016= findViewById(R.id.viewAnimator2P016);

        Animation animationFadeIn= AnimationUtils
                .loadAnimation(this,android.R.anim.fade_in);
        Animation animationFadeOut= AnimationUtils
                .loadAnimation(this,android.R.anim.fade_out);
        viewAnimator2P016.setInAnimation(animationFadeIn);
        viewAnimator2P016.setOutAnimation(animationFadeOut);
        viewAnimator2P016.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.viewAnimatorP016:
                checkKontrol= !checkKontrol;
                if(checkKontrol)
                    viewAnimator.showNext();
                else
                    viewAnimator.showPrevious();
                break;
            case R.id.buttonFirstP016:
                    viewAnimator.showNext();
                break;
            case R.id.buttonSecondP016:
                    viewAnimator.showPrevious();
                break;
            case R.id.viewAnimator2P016:
                viewAnimator2P016.showNext();
                break;
        }
    }
}
