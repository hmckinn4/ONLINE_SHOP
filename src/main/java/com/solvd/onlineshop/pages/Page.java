package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.interfaces.PageDisplay;

import java.util.Scanner;

public abstract class Page implements PageDisplay {

    public abstract int showPage(Scanner sc);

    protected abstract boolean convertChoiceToBool(String choice);

    public abstract String chooseClothingParams(Scanner sc, String[] validOptions, String choicetype);
}



