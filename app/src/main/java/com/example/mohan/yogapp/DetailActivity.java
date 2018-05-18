package com.example.mohan.yogapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohan.yogapp.R;

public class DetailActivity extends AppCompatActivity {

     private TextView Textv;
     private ImageView Img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_yoga);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();
        int image_url = extras.getInt("image_url");


       // String image_url = getIntent().get("image_url");

//        Textv = (TextView)findViewById(R.id.name);
//            Textv.setText(id);

            Img =(ImageView)findViewById(R.id.img);
              Img.setImageResource(image_url);
        }

//        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
        }



