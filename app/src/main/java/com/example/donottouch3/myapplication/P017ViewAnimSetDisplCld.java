package com.example.donottouch3.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ViewAnimator;

public class P017ViewAnimSetDisplCld extends AppCompatActivity implements ViewAnimator.OnClickListener{
    ViewAnimator viewAnimatorP017;
    int checkThree=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p017viewanimator_and_menu);

        viewAnimatorP017=(ViewAnimator)findViewById(R.id.viewAnimatorP017);
        viewAnimatorP017.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.viewAnimatorP017){
            checkThree ++;
            if(checkThree % 3 == 0)
            viewAnimatorP017.setDisplayedChild(0);
            else if(checkThree % 3 ==1)
                viewAnimatorP017.setDisplayedChild(1);
            else
                viewAnimatorP017.setDisplayedChild(2);
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem= menu.findItem(R.id.itemP017);
        if(checkThree % 3==0) {
            menuItem.setTitle("This");
            viewAnimatorP017.setDisplayedChild(0);
        }
        else if(checkThree % 3==1){
            menuItem.setTitle("is");
            viewAnimatorP017.setDisplayedChild(1);
        }
        else{
            menuItem.setTitle("secret");
            viewAnimatorP017.setDisplayedChild(2);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.p017menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        checkThree ++;
        invalidateOptionsMenu();
        return super.onOptionsItemSelected(item);
    }
}
