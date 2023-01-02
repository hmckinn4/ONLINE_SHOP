package com.solvd.onlineshop.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pants extends Clothing {

    //instance variables
    public int waistSize;

    //Constants
    //position 0,1,2 represents choices
    public static final String[] BRANDS = new String[]{"Levis","J-Crew","Louie"};

    public final List<String> brands = new ArrayList<>(Arrays.asList("Levis","J-Crew","Louie"));

    public static final String[] COLORS = new String[]{"Tan", "Navy", "Black"};
    public static final int PRICE = 20;
    public static final String[] MATERIAL = {"Khaki", "Jean", "Cotton"};


    //constructor
    public Pants(int productPrice,
                 String material,
                 String color,
                 String brand,
                 int waistSize) {
        super(productPrice, material, color, brand, String.valueOf(waistSize));
        this.material = material;
        this.waistSize = waistSize;
    }


    public void setMaterial(String material) {
        this.material = null;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = 0;
    }

    public int getWaistSize() {
        return this.waistSize;
    }

    @Override
    public String toString() {
        return "Pants \n" + super.toString();
    }

}