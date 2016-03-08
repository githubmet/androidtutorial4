package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

public class P011Handler extends Activity {
    Handler handler;
    ProgressBar progressBarP011;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p011handler);

        progressBarP011=(ProgressBar)findViewById(R.id.progressBarP011);


        //MyRunnableClass myRunnableClass=new MyRunnableClass();
        thread=new Thread(new MyRunnableClass());  //watch out parameter is a runnable
        thread.start();  //BU sayede backgound ta bir thread clientimiz olur.
        handler = new Handler(){  //And this is a RESEIVER. This is working different thread
            @Override
            public void handleMessage(Message msg) {
                progressBarP011.setProgress(msg.arg1);
            }
        };
    }
    public class MyRunnableClass implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<100;i++){ //bu blok icersinde Main thread te yeralan PorgressBar update edilecek
                Message message=Message.obtain(); //for every iteration You must do it.
                message.arg1=i;
                handler.sendMessage(message); //This is a sender
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
