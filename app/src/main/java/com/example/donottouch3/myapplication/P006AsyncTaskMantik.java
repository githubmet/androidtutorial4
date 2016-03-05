package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class P006AsyncTaskMantik extends Activity {
    TextView textViewP006;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p006asynctaskmantik);

        Button buttonP006= (Button)findViewById(R.id.buttonP006);
        buttonP006.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new MyAsyncTaskClass().execute("");
                    }
                }
        );
    }
    public class MyAsyncTaskClass extends AsyncTask<String,String,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            textViewP006= (TextView)findViewById(R.id.textViewP006);
        }

        @Override
        protected String doInBackground(String... params) { //dikkat UI only UI kuralini burada ihlal etme

            try {
                Thread.sleep(2000);
                publishProgress("First 2 seconds is done");
                Thread.sleep(2000);
                publishProgress("Second 2 seconds is done");
                Thread.sleep(2000);
                publishProgress("Third 2 seconds is done");
                Thread.sleep(2000);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Misson is completed";
        }

        @Override
        protected void onProgressUpdate(String... values) {  //dikkat ... -->[]
            super.onProgressUpdate(values);
            textViewP006.setText(values[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textViewP006.setText(s);
        }
    }
}
