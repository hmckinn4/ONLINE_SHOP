package com.solvd.onlineshop.functionalinterfaces;

import com.solvd.onlineshop.models.Product;

@FunctionalInterface
public interface DiscountCalculator<T extends Product> {
    double calculateDiscount(int loyaltyPoints);
}

