package com.solvd.onlineshop.models;

public class Shirt extends Clothing {
    //array of strings
    private boolean shortOrLongSleeve;

    public static final int PRICE = 15;
    public static final String [] MATERIAL = new String[] {"Cotton", "Polyester", "Silk"};
    public static final String [] BRAND = new String[] {"Store Brand", "Nike", "Louie"};
    public static final boolean SHORTSLEEVE = true;
    //constructor


    public Shirt(int productPrice,
                 String material,
                 String color,
                 String brand,
                 String size,
                 boolean shortOrLongSleeve)
    {
        super(productPrice, material, color, brand, size);
        this.shortOrLongSleeve = shortOrLongSleeve;
    }

    public boolean getShortOrLongSleeve() {
        return shortOrLongSleeve;
    }

    public void setShortOrLongSleeve(boolean shortOrLongSleeve) {
        this.shortOrLongSleeve = shortOrLongSleeve;
    }



    @Override
    public String toString() {return super.toString() + "\n Sleeves: " + getShortOrLongSleeve();}


}
