package com.example.mohan.yogapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.TypedValue;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.os.Bundle;


import static com.example.mohan.yogapp.R.id.parent;

public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            if(position==0){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }
                if(position==1){
                    Intent intent = new Intent(MainActivity.this, Pranayam.class);
                    startActivity(intent);

                }
                if(position==2){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }
                if(position==3){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }if(position==4){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }
                if(position==5){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }
                if(position==6){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }
                if(position==7){
                    Intent intent = new Intent(MainActivity.this, YogaCategoryActivity.class);
                    startActivity(intent);

                }



            }
        };

        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);


    }
}
