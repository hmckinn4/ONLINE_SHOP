package com.solvd.onlineshop.enums;

public enum Brand {
    IKEA("Ikea"),
    WALMART("Walmart"),
    RESTORATION_HARDWARE("Restoration Hardware"),
    LOUIS_VUITTON("Louis Vuitton"),
    CANADA_GOOSE("Canada Goose"),
    GUCCI("Gucci"),
    NIKE("Nike"),
    STORE_BRAND("Store Brand"),
    J_CREW("J Crew"),
    LEVI("Levi");

    private String brand;

    private Brand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return this.brand;
    }
}
