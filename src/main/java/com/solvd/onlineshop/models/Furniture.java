package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

public abstract class Furniture extends Product {
    //Product fields

    private boolean hasCupholders;

    public static final Material[] MATERIAL = new Material[] {Material.METAL, Material.PLASTIC, Material.WOOD};
    public static final Brand[] BRAND = new Brand[] {Brand.WALMART,Brand.IKEA,Brand.RESTORATION_HARDWARE};
    public static final boolean CUPHOLDERS = true;

    public Furniture(int productPrice, Material material, Colors color, Brand brand, boolean hasCupholders) {
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
