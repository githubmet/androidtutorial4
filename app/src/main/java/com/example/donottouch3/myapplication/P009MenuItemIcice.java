package com.example.donottouch3.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class P009MenuItemIcice extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        setContentView(relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=new MenuInflater(P009MenuItemIcice.this);
        menuInflater.inflate(R.menu.p009menuitems,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.menuItemRedP009:
                Toast.makeText(P009MenuItemIcice.this,"Red",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemGreenP009:
                Toast.makeText(P009MenuItemIcice.this,"Green",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemBlueP009:
                Toast.makeText(P009MenuItemIcice.this,"Blue",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemBlueInP009:
                Toast.makeText(P009MenuItemIcice.this,"BlueIn",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemBlueIn2P009:
                Toast.makeText(P009MenuItemIcice.this,"BlueIn2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuItemBlueIn3P009:
                Toast.makeText(P009MenuItemIcice.this,"BlueIn3",Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
