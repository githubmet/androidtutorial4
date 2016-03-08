package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class P013FixOrientation extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p013fixorientation);

        Button buttonP013= (Button)findViewById(R.id.buttonP013);
        buttonP013.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new MyAsyncTaskClass().execute();
    }
    public class MyAsyncTaskClass extends AsyncTask<Void,Integer,String>{
        TextView textViewP013;
        @Override
        protected void onPreExecute() {
            textViewP013= (TextView)findViewById(R.id.textViewP013);
            if(P013FixOrientation.this.getResources().getConfiguration().orientation==
                    Configuration.ORIENTATION_PORTRAIT){
                P013FixOrientation.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                // P013FixOrientation.this.setRequestedOrientation(Configuration.ORIENTATION_PORTRAIT);
            }
            else{
                P013FixOrientation.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }

        }

        @Override
        protected String doInBackground(Void... params) {
            for(int i=0;i<100;i++){
            try {
                Thread.sleep(100);
                publishProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
            return "mission is completed. Now you can change the device orientation";
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            textViewP013.setText("Integer value="+values[0]+ "\nyou can not change the device orientation until mission is completed");
        }

        @Override
        protected void onPostExecute(String s) {
            textViewP013.setText(s);
            //This is return all restrict to normal
            P013FixOrientation.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        }
    }
}
