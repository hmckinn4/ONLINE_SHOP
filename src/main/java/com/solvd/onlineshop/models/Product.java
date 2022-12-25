package com.solvd.onlineshop.models;


import com.solvd.onlineshop.interfaces.AssignHashcode;
import com.solvd.onlineshop.interfaces.IDisplay;

import java.util.Objects;

abstract public class Product implements IDisplay, AssignHashcode {
    public int productID;
    public int price;
    public String material;
    public String color;
    public String brand;
    public static int numberOfProducts = 0;

    //constructor
    public Product( int productPrice, String material, String color, String brand) {
        this.price = productPrice;
        this.material = material;
        this.color = color;
        this.brand = brand;
        productID = ++numberOfProducts;
    }

    //methods

    //instance variable getters and setters
    public int getID() {
        return this.productID;
    }

    public void setID(int ID) {
        this.productID = ID;
    }

    public int getPrice() { return this.price;}

    public void setPrice(int inputPrice) { this.price = inputPrice; }

    public String getColor() {return this.color;}

    public void setColor(String color) {this.color = color;}

    public String getMaterial() {return this.material;}

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    @Override
//    public String toString()
//    {return "Product Number: #" +
//            this.getID() + "\n Price: $" +
//            this.getPrice() + "\n Color: " +
//            this.getColor() + "\n Material: " +
//            this.getMaterial() + "\n Brand: " +
//            this.getBrand();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same address?
        if (!(o instanceof Product)) return false; // both instances of product?
        Product product = (Product) o;
        return productID == product.productID; // Custom check method
    }

    @Override
    public String toString() {
        {return "Product Number: #" +
                this.getID() + "\n Price: $" +
                this.getPrice() + "\n Color: " +
                this.getColor() + "\n Material: " +
                this.getMaterial() + "\n Brand: " +
                this.getBrand();}
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
