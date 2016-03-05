package com.example.donottouch3.myapplication.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.donottouch3.myapplication.P008IntentForBroadcast;

public class P008BroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle=intent.getExtras();
        String message=bundle.getString(P008IntentForBroadcast.DEPREM_YAYINI);

        Toast.makeText(context,"Message from Broadcast "+message,Toast.LENGTH_LONG).show();
    }
}
