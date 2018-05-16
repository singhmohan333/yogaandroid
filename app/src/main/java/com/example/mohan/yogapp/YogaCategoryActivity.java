package com.example.mohan.yogapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class YogaCategoryActivity extends ListActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listyoga = getListView();

        ArrayAdapter<Yoga> listAdapter = new ArrayAdapter<Yoga>(
                this,
                android.R.layout.simple_list_item_1,
                Yoga.yoga
        );
        listyoga.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView ListView, View itemView, int position, long id){

        Intent intent= new Intent(YogaCategoryActivity.this, DetailActivity.class);
      //  intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

}

