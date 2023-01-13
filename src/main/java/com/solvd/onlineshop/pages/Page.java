package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.functionalinterfaces.FormatInput;
import com.solvd.onlineshop.interfaces.PageDisplay;

import java.util.Scanner;
import java.util.logging.Logger;

public abstract class Page implements PageDisplay {


    // Define the lambda function
    // lambda expression to make uppercase string
    public FormatInput formatInput = (String s) -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

    public static final Logger logger = Logger.getLogger(ClothingPage.class.getName());

    public abstract int showPage(Scanner sc);

    public abstract boolean convertChoiceToBool(String choice);

    public abstract String chooseProductParams(Scanner sc, String[] validOptions, String choicetype);

    public abstract int convertChoiceToInt(String choice);
}

// return Integer.parseInt(choice);

