package com.example.donottouch3.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class P005ActionSEND extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        Button button=new Button(this);
        button.setText("Intent.Action.SEND");
        relativeLayout.addView(button);
        setContentView(relativeLayout);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        startActivity(intent);
                    }
                }
        );
    }
}
