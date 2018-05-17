package com.example.mohan.yogapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pranayam extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ListView niyam = getListView();

        ArrayAdapter<PranayamItem> listAdapter = new ArrayAdapter<PranayamItem>(
                this,
                android.R.layout.simple_list_item_1,
                PranayamItem.pranayamItems
        );
        niyam.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView ListView, View itemView, int position, long id) {

        Intent intent = new Intent(Pranayam.this, DetailActivity.class);

        intent.putExtra("id","id");
        startActivity(intent);


    }
}