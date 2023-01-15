package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.models.Product;

import java.util.Scanner;

public interface ShowCart<T extends Product> {
    int showCart(Scanner sc);
}

