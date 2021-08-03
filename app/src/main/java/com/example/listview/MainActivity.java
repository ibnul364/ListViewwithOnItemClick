package com.example.listview;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter adapter ;
    private ListView  listView;
//    private EditText srchFilter;


    //OnItemClickListener For a ListView [display a message when clicked]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listId);
//        srchFilter = findViewById(R.id.searchFilter);

        final ArrayList<String> names = new ArrayList<>();

        names.add("JHON");
        names.add("STEVE");
        names.add("GREON");
        names.add("JHUAN");
        names.add("JIPPO");
        names.add("MUSCLE");

        adapter = new ArrayAdapter(this,R.layout.list_item_layout,names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d(TAG,"onItemClick : name : "+names.get(position));
                Toast.makeText(getApplicationContext(), "You Clicked on: "+names.get(position),Toast.LENGTH_LONG).show();
            }
        });

    }
}