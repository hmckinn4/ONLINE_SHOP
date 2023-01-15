package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.models.Product;

public interface RemoveFromCart<T extends Product> {
    boolean removeFromCart(int productID);
}
