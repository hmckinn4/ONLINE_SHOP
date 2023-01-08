package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

public class Table extends Furniture{

    public static final String [] COLORS = new String[] {"White","Oak","Gray"};
    public static final int PRICE = 100;

    public Table(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
                 boolean hasCupholders) {
        super(productPrice, material, color, brand, hasCupholders);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
