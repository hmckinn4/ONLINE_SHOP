package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.models.Product;

public interface AddtoCart<T extends Product> {
    void addCart(Product toAddToCart);

}
