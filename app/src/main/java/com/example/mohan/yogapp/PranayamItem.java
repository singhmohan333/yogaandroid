package com.example.mohan.yogapp;


public class PranayamItem {


    private String name;
    private String desc;
    private int id;

    public static final PranayamItem[] pranayamItems = {
            new PranayamItem("kapalbhati","this is for yog", R.drawable.garunasan ),
            new PranayamItem("anulonvilom","this is cdcdcdcdc yog", R.drawable.garunasan),
            new PranayamItem("bhstrika","this is for yog", R.drawable.bharmipranaym),
            new PranayamItem("12345","this is for dyog", R.drawable.bharmipranaym),


    };

    private PranayamItem(String name, String desc, int id){
        this.name=name;
        this.desc=desc;
        this.id=id;
    }
     public String getName(){

         return name;
     }
    public String getDesc(){

        return desc;
    }
    public int getImageID(){

        return id;
    }
    public String toString(){
        return this.name;

    }


}
