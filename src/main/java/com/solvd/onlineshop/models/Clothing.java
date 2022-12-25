package com.solvd.onlineshop.models;

import com.solvd.onlineshop.interfaces.AssignHashcode;

public abstract class Clothing extends Product implements AssignHashcode {
    //Product fields
    public String size;

    public static final String [] TOPSIZES = new String[] {"S","M","L"};
    //position 0,1,2 represents choices
    public static final String [] TOPCOLORS = new String[] {"Red","Blue","Green"};

    public static final int [] BOTTOMSWAISTSIZE = {29,30,31,32,33,34,35,36};

    //constructor


    public Clothing(int productPrice, String material, String color, String brand, String size) {
        super(productPrice, material, color, brand);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public  String toString()
    {return super.toString() +
            "\n Size: " + this.getSize();}

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
