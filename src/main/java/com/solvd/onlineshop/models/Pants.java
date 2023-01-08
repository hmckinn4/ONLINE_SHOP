package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;
import com.solvd.onlineshop.enums.Size;

public class Pants extends Clothing {

    //instance variables
    public int waistSize;

    //Constants
    //position 0,1,2 represents choices
    public static final Brand[] BRANDS = new Brand[]{Brand.LEVI,Brand.J_CREW,Brand.LOUIS_VUITTON};

    public static final Colors[] COLORS = new Colors[]{Colors.TAN,Colors.BLACK,Colors.NAVY};
    public static final int PRICE = 20;
    public static final Material[] MATERIAL = new Material[]{Material.JEANS,Material.COTTON,Material.KHAKI};


    //constructor
    public Pants(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
                 int waistSize) {
        super(productPrice, material, color, brand, Size.SMALL);
        this.material = material;
        this.waistSize = waistSize;
    }


    public void setMaterial(Material material) {
        this.material = null;
    }

    public Material getMaterial() {
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