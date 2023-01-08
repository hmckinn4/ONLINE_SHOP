package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Material;
import com.solvd.onlineshop.enums.Size;
import com.solvd.onlineshop.enums.Colors;

public class Jacket extends Clothing {

    //subclass fields
    public boolean hasPockets;
    private boolean hasZippers;


    //concatonate strings to number and convert the id to a int


    public static final Material[] MATERIAL = new Material[] {Material.COTTON, Material.POLYESTER, Material.LEATHER};

    public static final Brand[] BRAND = new Brand[] {Brand.CANADA_GOOSE,Brand.GUCCI,Brand.LOUIS_VUITTON};
    public static final int PRICE = 40;
    public static final boolean POCKETS = true;
    public static final boolean ZIPPERS = true;


    //constructor
    public Jacket(int productPrice,
                  Material material,
                  Colors color,
                  Brand brand,
                  Size size,
                  boolean hasPockets,
                  boolean hasZippers)
    {
        super(productPrice, material, color, brand, size);
        this.hasPockets = hasPockets;
        this.hasZippers = hasZippers;
    }

    public void setHasPockets(boolean hasPockets){
        this.hasPockets = true;
    }

    public boolean getHasPockets(){
        return hasPockets;
    }

    public void setHasZippers(boolean hasZippers){
        this.hasZippers = true;
    }

    public boolean getHasZippers(){
        return hasZippers;
    }

    @Override
    public String toString() {return "Jacket" + "\n" + super.toString() + "\n Has Pockets: " + getHasPockets() + "\n Has Zippers: " + getHasZippers(); }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}