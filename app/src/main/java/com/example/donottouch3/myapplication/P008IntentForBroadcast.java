package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class P008IntentForBroadcast extends Activity {
    public static final String DEPREM_YAYINI="deprem_yayini";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        Button button=new Button(this);
        button.setText("Start a broadcast");
        relativeLayout.addView(button);
        setContentView(relativeLayout);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent();
                        intent.setAction("com.example.donottouch3.myapplication.DEPREM");
                        intent.putExtra(DEPREM_YAYINI,"Please, be carefull. The Earthquae is starting");
                        sendBroadcast(intent);
                    }
                }
        );
    }
}
