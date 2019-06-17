package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class P000AsyncTask extends Activity implements View.OnClickListener {

    TextView textViewP000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p000_asynctask);

        findViewById(R.id.buttonP000).setOnClickListener(this);
        textViewP000= findViewById(R.id.textViewP000);
    }

    @Override
    public void onClick(View v) {
        new MyAsyncTaskClass().execute(123);
    }

    class MyAsyncTaskClass extends AsyncTask<Integer,Integer,Integer>{


        @Override
        protected Integer doInBackground(Integer... ıntegers) {
            try {
                publishProgress(500);
                Thread.sleep(500);
                publishProgress(1000);
                Thread.sleep(500);
                publishProgress(1500);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return 10000;
        }

        @Override
        protected void onPostExecute(Integer ınteger) {
            super.onPostExecute(ınteger);
            textViewP000.setText("Hello "+ınteger);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            textViewP000.setText(values[0]+" Hello");
        }
    }
}
