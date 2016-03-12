package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.donottouch3.myapplication.fragment.P019CardViewFragment;

public class P019CardView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p019cardview);

        getFragmentManager().beginTransaction()
                .add(R.id.frameLayoutP019,new P019CardViewFragment())
                .commit();
    }
}
