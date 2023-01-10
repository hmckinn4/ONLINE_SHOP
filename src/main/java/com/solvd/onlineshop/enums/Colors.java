package com.solvd.onlineshop.enums;

public enum Colors {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    TAN("Tan"),
    NAVY("Navy"),
    BLACK("Black"),
    BEIGE("Beige"),
    MAROON("Maroon"),
    WHITE("White"),
    OAK("Oak"),
    GRAY("Gray");

    private String abbreviation;

    private Colors(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String toString() {
        return this.abbreviation;
    }
}
