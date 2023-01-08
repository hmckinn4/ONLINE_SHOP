package com.solvd.onlineshop.models;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;
import com.solvd.onlineshop.enums.Size;

public class Shirt extends Clothing {
    //array of strings
    private boolean shortOrLongSleeve;

    public static final int PRICE = 15;
    public static final Material[] MATERIAL = new Material[] {Material.COTTON,Material.POLYESTER,Material.SILK};
    public static final Brand[] BRAND = new Brand[] {Brand.STORE_BRAND,Brand.NIKE,Brand.LOUIS_VUITTON};
    public static final boolean SHORTSLEEVE = true;
    //constructor


    public Shirt(int productPrice,
                 Material material,
                 Colors color,
                 Brand brand,
                 Size size,
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
