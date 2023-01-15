package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

public class Table extends Furniture{

    private boolean doesFold = false;

    public static final Colors [] COLORS = new Colors[] {Colors.WHITE, Colors.OAK, Colors.GRAY};
    public static final int PRICE = 100;

    public Table(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
                 boolean hasCupholders,
                 boolean doesFold) {
        super(productPrice, material, color, brand, hasCupholders);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Folds?: " + this.getDoesFold();
    }

    private boolean getDoesFold() {
        return this.doesFold;
    }
}
