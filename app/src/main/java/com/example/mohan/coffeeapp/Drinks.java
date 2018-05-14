package com.example.mohan.coffeeapp;


public class Drinks {


    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks = {
            new Drinks("caffee","this is for coffee",R.drawable.bharmipranaym ),
            new Drinks("cup","this is for cup",R.drawable.cof2),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),
            new Drinks("Drink","this is for drink",R.drawable.cof3),

    };

    private Drinks(String name, String desc, int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }
     public String getName(){

         return name;
     }
    public String getDesc(){

        return desc;
    }
    public int getImageID(){

        return imageID;
    }
    public String toString(){
        return this.name;
    }

}
