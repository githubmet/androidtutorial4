package com.example.donottouch3.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class P003ListVSGenerics extends Activity implements View.OnClickListener {
    TextView textViewListP003;
    TextView textViewListGenericsP003;
    TextView textViewListIteratorP003;
    TextView textViewIntegerArrayP003;
    AutoCompleteTextView autoCompleteTextViewP003;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003listvsgenerics);

        Button buttonListP003= (Button)findViewById(R.id.buttonListP003);
        Button buttonListGenericsP003= (Button)findViewById(R.id.buttonListGenericsP003);
        Button buttonListIteratorP003= (Button)findViewById(R.id.buttonListIteratorP003);
        Button buttonIntegerArrayP003= (Button)findViewById(R.id.buttonIntegerArrayP003);
        buttonListP003.setOnClickListener(this);
        buttonListGenericsP003.setOnClickListener(this);
        buttonListIteratorP003.setOnClickListener(this);
        buttonIntegerArrayP003.setOnClickListener(this);

        textViewListP003= (TextView)findViewById(R.id.textViewListP003);
        textViewListGenericsP003= (TextView)findViewById(R.id.textViewListGenericsP003);
        textViewListIteratorP003= (TextView)findViewById(R.id.textViewListIteratorP003);
        textViewIntegerArrayP003=(TextView)findViewById(R.id.textViewIntegerArrayP003);

        autoCompleteTextViewP003=(AutoCompleteTextView)findViewById
                (R.id.autoCompleteTextViewP003);

        String[] countryNames=getResources().getStringArray(R.array.country_names);
        ArrayAdapter arrayAdapter=new ArrayAdapter(P003ListVSGenerics.this,
                android.R.layout.simple_dropdown_item_1line,countryNames);
        autoCompleteTextViewP003.setAdapter(arrayAdapter);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonListP003:
                List list=new ArrayList();
                list.add("Hello from List ");
                String getList= (String) list.get(0); //You have to cast
                textViewListP003.setText(getList);
                break;
            case R.id.buttonListGenericsP003:
                List<String> listGenerics=new ArrayList<String>();
                listGenerics.add("Hello from List Generics");
                String getListGenerics=listGenerics.get(0); //you do not need to cast
                textViewListGenericsP003.setText(getListGenerics);

                break;
            case R.id.buttonListIteratorP003:
                List listKatar=new ArrayList();
                listKatar.add("Hello ");
                listKatar.add("from ");
                listKatar.add("ListIterator");

                ListIterator listIterator= listKatar.listIterator();
                StringBuilder sb=new StringBuilder();
                while(listIterator.hasNext()){
                    sb.append(listIterator.next());
                }
                textViewListIteratorP003.setText(sb.toString());
                break;
            case R.id.buttonIntegerArrayP003:
                int[] intDizi=getResources().getIntArray(R.array.integer_array);
                StringBuilder sb2=new StringBuilder();
                for(int i=0;i<intDizi.length;i++){
                    sb2.append(intDizi[i]*1000+" ");
                }
                textViewIntegerArrayP003.setText(sb2.toString());
                break;
        }
    }
}
