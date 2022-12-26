package com.solvd.onlineshop.models;

public class Table extends Furniture{

    public static final String [] COLORS = new String[] {"White","Oak","Gray"};
    public static final int PRICE = 100;

    public Table(int productPrice,
                 String material,
                 String color,
                 String brand,
                 boolean hasCupholders) {
        super(productPrice, material, color, brand, hasCupholders);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
