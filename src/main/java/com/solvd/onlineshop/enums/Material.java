package com.solvd.onlineshop.enums;

public enum Material {
    WOOD("Wood"),
    METAL("Metal"),
    PLASTIC("Plastic"),
    LEATHER("Leather"),
    POLYESTER("Polyester"),
    COTTON("Cotton"),
    SILK("Silk"),
    KHAKI("Khaki"),
    JEANS("Jeans");

    private String material;

    private Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return this.material;
    }
}
