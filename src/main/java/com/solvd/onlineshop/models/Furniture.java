package com.solvd.onlineshop.models;

import java.util.Objects;

public abstract class Furniture extends Product {
    //Product fields

    private boolean hasCupholders;

    public static final String [] MATERIAL = new String[] {"Wood", "Plastic", "Metal"};
    public static final String [] BRAND = new String[] {"Ikea", "Walmart", "Restoration Hardware"};
    public static final boolean CUPHOLDERS = true;

    public Furniture(int productPrice, String material, String color, String brand, boolean hasCupholders) {
        super(productPrice, material, color, brand);
        this.hasCupholders = hasCupholders;
    }

    public boolean getHasCupholders() {
        return hasCupholders;
    }

    public void setHasCupholders(boolean hasCupholders) {
        this.hasCupholders = hasCupholders;
    }

    @Override
    public  String toString(){return super.toString() + ", Cup-holders: " + this.getHasCupholders();}
}
