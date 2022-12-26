package com.solvd.onlineshop.models;

public class Jacket extends Clothing {

    //subclass fields
    public boolean hasPockets;
    private boolean hasZippers;


    //concatonate strings to number and convert the id to a int


    public static final String [] MATERIAL = new String[] {"Leather", "Cotton", "Polyester"};

    public static final String [] BRAND = new String[] {"Canada-Goose", "Gucci", "Louie"};
    public static final int PRICE = 40;
    public static final boolean POCKETS = true;
    public static final boolean ZIPPERS = true;


    //constructor
    public Jacket(int productPrice,
                  String material,
                  String color,
                  String brand,
                  String size,
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