package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class P010CustomToastMessage extends Activity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p010customtoastmessage);

        Button buttonP010= (Button)findViewById(R.id.buttonP010);
        buttonP010.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        ViewGroup viewGroupRelativeLayout=(ViewGroup)findViewById(R.id.relativeLayoutP010);
        LayoutInflater layoutInflater = getLayoutInflater();
        View view= layoutInflater.inflate(R.layout.p010customtoastlayout,
                viewGroupRelativeLayout);

        Toast toast=new Toast(P010CustomToastMessage.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.TOP,0,0);
        toast.setView(view);
        toast.show();

    }
}
