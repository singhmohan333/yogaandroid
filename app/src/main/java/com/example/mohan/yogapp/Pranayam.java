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


        ListView y = getListView();

        ArrayAdapter<PranayamItem> listAdapter = new ArrayAdapter<PranayamItem>(
                this,
                android.R.layout.simple_list_item_1,
                PranayamItem.pranayamItems
        );
        y.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView ListView, View itemView, int position, long id) {

        Intent intent = new Intent(Pranayam.this, DetailActivity.class);

        if (id == 0) {
            intent.putExtra("image_url", R.drawable.garunasan);
        } else if (id == 2) {
            {
                intent.putExtra("image_url", R.drawable.bharmipranaym);

            }
            if (id == 3) {

                startActivity(intent);


            }
        }
    }
}