package com.example.donottouch3.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class P015invalidateOptionsMenu extends AppCompatActivity {

    public boolean checkKontrol=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        setContentView(relativeLayout);

    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        MenuItem menuItem=menu.findItem(R.id.itemP015);
        menuItem.setTitle(checkKontrol ? "Turn on":"Turn off");

        return super.onPrepareOptionsMenu(menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater menuInflater= new MenuInflater(this);
        //menuInflater.inflate(R.menu.p015menu,menu);
        getMenuInflater().inflate(R.menu.p015menu, menu); //This one is short one
        return true; //super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.itemP015){
            checkKontrol= !checkKontrol; // amazing :) One line of code
        }

        invalidateOptionsMenu(); //Declare that the options menu has changed, so should be recreated.
        return super.onOptionsItemSelected(item);  //bela bu super ler.
    }
}
