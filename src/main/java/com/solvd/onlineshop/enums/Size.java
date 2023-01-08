package com.solvd.onlineshop.enums;

public enum Size {
    SMALL("Small"), MEDIUM("Medium"), LARGE("Large"), EXTRA_LARGE("Extra-Large");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String toString() {
        return this.abbreviation;
    }
}
