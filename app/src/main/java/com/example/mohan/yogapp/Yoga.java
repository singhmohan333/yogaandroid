package com.example.mohan.yogapp;


public class Yoga {


    private String name;
    private String desc;
    private int imageID;

    public static final Yoga[] yoga = {
            new Yoga("yoga","this is for yog", R.drawable.bharmipranaym ),
            new Yoga("yog","this is for yog",R.drawable.bharmipranaym),
            new Yoga("onlyyoga","this is for yog",R.drawable.bharmipranaym),
            new Yoga("yog","this is for dyog",R.drawable.bharmipranaym),


    };

    private Yoga(String name, String desc, int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;


    }
     public String getName(){

         return this.name;
     }
    public String getDesc(){

        return this.desc;
    }
    public int getImageID(){

        return this.imageID;
    }
    public String toString(){
        return this.name;
    }

}
