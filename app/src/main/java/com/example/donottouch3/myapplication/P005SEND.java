package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class P005SEND extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        setContentView(relativeLayout);

        Toast.makeText(P005SEND.this,"Hello from an Activity which have been called smartly",
                Toast.LENGTH_LONG).show();
    }
}
