package com.solvd.onlineshop.models;

public class Couch extends Furniture {

    public static final String [] COLORS = new String[] {"Baige","Maroon","Black"};
    public static final int PRICE = 200;

    public Couch(int productPrice,
                 String material,
                 String color,
                 String brand,
                 boolean hasCupholders) {
        super(productPrice, material, color, brand, hasCupholders);
    }


    @Override
    public String toString() {return super.toString();}

}