package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.pages.Cart;

import java.util.Scanner;

public interface CheckOut {
   double checkOut(Cart cart, double payment, Scanner sc);
}
