package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

public class Couch extends Furniture {

    public static final String [] COLORS = new String[] {"Beige","Maroon","Black"};
    public static final int PRICE = 200;

    public Couch(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
                 boolean hasCupholders) {
        super(productPrice, material, color, brand, hasCupholders);
    }


    @Override
    public String toString() {return super.toString();}

}