package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class P024AsyncTask extends Activity {
    TextView textViewP024;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p024asynctask);

        textViewP024= findViewById(R.id.textViewP024);

    }

    public void onClickMtdP024(View view) {
        new MyAsyncTaskClass().execute("deneme");
    }
    private class MyAsyncTaskClass extends AsyncTask<String,String,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            textViewP024.setText("onPreExecute()");
        }

        @Override
        protected String doInBackground(String... strings) {

            try {
                Thread.sleep(2000);
                publishProgress("2 seconds");
                Thread.sleep(2000);
                publishProgress("4 seconds");
                Thread.sleep(2000);
                publishProgress("6 seconds");
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "mission is complete";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            textViewP024.setText(values[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textViewP024.setText(s);
        }
    }
}
