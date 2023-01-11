package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.*;

public abstract class Clothing extends Product {
    //Product fields
    public Size size;

    public static final Size [] TOPSIZES = new Size[] {Size.SMALL, Size.MEDIUM, Size.LARGE, Size.EXTRA_LARGE};

    public static final Colors[] TOPCOLORS = new Colors[] {Colors.RED, Colors.BLUE, Colors.GREEN,};

    public static final BottomWaistSize[] BOTTOMSWAISTSIZE = new BottomWaistSize[] {BottomWaistSize.XS, BottomWaistSize.S, BottomWaistSize.M, BottomWaistSize.L, BottomWaistSize.XL, BottomWaistSize.XXL};

    //constructor


    public Clothing(int productPrice, Material material, Colors color, Brand brand, Size size, BottomWaistSize waistSize) {
        super(productPrice, material, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
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
