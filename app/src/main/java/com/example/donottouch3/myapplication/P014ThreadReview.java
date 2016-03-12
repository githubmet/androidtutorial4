package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ProgressBar;

public class P014ThreadReview extends Activity {
    ProgressBar progressBarP014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p014threadreview);

        progressBarP014= (ProgressBar)findViewById(R.id.progressBarP014);
        progressBarP014.setVisibility(ProgressBar.VISIBLE);

        Thread thread=new Thread(new MyRunnableClass());
        thread.start();

        if(this.getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        else{
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }
    public class MyRunnableClass implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<100;i++) {
                progressBarP014.setProgress(i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
