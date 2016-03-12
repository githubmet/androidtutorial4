package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class P012AsyncTaskReview extends Activity {
    String[] textDizi={"text 1","text 2","text 3","text 4","text 5","text 6",
            "text 7","text 8","text 9","text 10"};
    ListView listViewP012;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //dikkat konum onemli
        requestWindowFeature(Window.FEATURE_PROGRESS);  //This is a progressBar smart. And This is have max size 10000
        setContentView(R.layout.p012asynctaskreview);


        listViewP012=(ListView)findViewById(R.id.listViewP012);
        listViewP012.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,new ArrayList<String>()));

        new MyAsycnTaskClass().execute();

    }
    public class MyAsycnTaskClass extends AsyncTask<Void,String,Void> {
        ArrayAdapter<String> arrayAdapter;
        private int count=0;
        @Override
        protected void onPreExecute() {
            arrayAdapter= (ArrayAdapter<String>) listViewP012.getAdapter();
            setProgressBarIndeterminate(false);
            setProgressBarVisibility(true);
        }
        @Override
        protected Void doInBackground(Void... params) {
            for(String item:textDizi){
                publishProgress(item);  //Publish yayinla...

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return null;
        }
        @Override
        protected void onProgressUpdate(String... values) {
            arrayAdapter.add(values[0]);
            count =count+1000;
            setProgress(count);//(int)(((double)count/textDizi.length)*1000));
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(P012AsyncTaskReview.this,"All items added to listView successfully",
                    Toast.LENGTH_LONG).show();
            setProgressBarVisibility(false);
        }
    }
}
