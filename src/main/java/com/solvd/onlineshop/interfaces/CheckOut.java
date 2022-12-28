package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.pages.Cart;

public interface CheckOut {
   double checkOut(Cart cart, double payment);
}
