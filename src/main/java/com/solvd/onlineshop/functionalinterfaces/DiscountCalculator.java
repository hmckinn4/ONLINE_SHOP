package com.solvd.onlineshop.functionalinterfaces;

@FunctionalInterface
public interface DiscountCalculator {
    double calculateDiscount(int loyaltyPoints);
}

