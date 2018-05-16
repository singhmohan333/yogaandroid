package com.example.mohan.yogapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pranayam extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranayam);


        ListView niyam = getListView();

        ArrayAdapter<Pranayam> listAdapter = new ArrayAdapter<Pranayam>(
                this,
                android.R.layout.simple_list_item_2,
                Pranayam.CONTEXT_INCLUDE_CODE
        );
        niyam.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView ListView, View itemView, int position, long id) {

        Intent intent = new Intent(Pranayam.this, DetailActivity.class);
        //  intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}