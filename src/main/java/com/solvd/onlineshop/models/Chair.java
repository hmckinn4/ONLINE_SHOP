package com.solvd.onlineshop.models;

public class Chair extends Furniture {

    public boolean reclines;

    public static final boolean RECLINES = true;

    public static final String [] COLORS = new String[] {"Baige","Maroon","Black"};
    public static final int PRICE = 50;

    public Chair(int productPrice,
                 String material,
                 String color,
                 String brand,
                 boolean hasCupholders,
                 boolean reclines) {
        super(productPrice, material, color, brand, hasCupholders);
        this.reclines = reclines;
    }

    public boolean getReclines() {
        return reclines;
    }

    public void setReclines(boolean reclines) {
        this.reclines = reclines;
    }

    @Override
    public String toString() {return super.toString() + ", Reclines?: " + this.getReclines();}

}