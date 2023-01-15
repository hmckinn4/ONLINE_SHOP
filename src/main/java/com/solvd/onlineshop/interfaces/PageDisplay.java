package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.pages.Cart;

import java.util.Scanner;

public interface PageDisplay {

    public int showPage(Scanner sc, Cart cart);

    public boolean convertChoiceToBool(String choice) throws NullPointerException;

    public String chooseProductParams(Scanner sc, String[] validOptions, String choicetype);

}
