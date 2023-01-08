package com.solvd.onlineshop.models;


import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;

abstract public class Product {
    public int productID;
    public int price;
    public Material material;
    public Colors color;
    public Brand brand;
    public static int numberOfProducts = 0;

    //constructor
    public Product(int productPrice, Material material, Colors color, Brand brand) {
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

    public Colors getColor() {return this.color;}

    public void setColor(Colors color) {this.color = color;}

    public Material getMaterial() {return this.material;}

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

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
