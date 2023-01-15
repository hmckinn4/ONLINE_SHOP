package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.models.Product;
import com.solvd.onlineshop.pages.Cart;

import java.util.Scanner;

public interface CheckOut<T extends Product> {
   double checkOut(Cart cart, double payment, Scanner sc);
}
