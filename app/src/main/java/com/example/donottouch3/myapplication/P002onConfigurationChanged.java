package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class P002onConfigurationChanged extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.parseColor("#006699"));
        setContentView(relativeLayout);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        switch(newConfig.orientation){
            case Configuration.ORIENTATION_PORTRAIT:
                Toast.makeText(P002onConfigurationChanged.this,"Portrait",Toast.LENGTH_LONG).show();
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                Toast.makeText(P002onConfigurationChanged.this,"Landscape",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
