package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

public class Chair extends Furniture {

    public boolean reclines;

    public static final boolean RECLINES = true;

    public static final Colors[] COLORS = new Colors[] {Colors.BEIGE, Colors.MAROON, Colors.BLACK};
    public static final int PRICE = 50;

    public Chair(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
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