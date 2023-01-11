package com.solvd.onlineshop.enums;

public enum BottomWaistSize {
XS(0),
    S(1),
    M(2),
    L(3),
    XL(4),
    XXL(5);

    private int value;

    BottomWaistSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
