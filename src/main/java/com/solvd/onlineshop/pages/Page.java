package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.enums.Size;
import com.solvd.onlineshop.interfaces.PageDisplay;

import java.util.Scanner;
import java.util.logging.Logger;

public abstract class Page implements PageDisplay {

    public interface UpperCase {
        String apply(String s);
    }
    // Define the lambda function
    public UpperCase upperCase = s -> s.toUpperCase();

    //Enum
    private Size size;


    public static final Logger logger = Logger.getLogger(ClothingPage.class.getName());

    public abstract int showPage(Scanner sc);

    protected abstract boolean convertChoiceToBool(String choice);

    public abstract String chooseClothingParams(Scanner sc, String[] validOptions, String choicetype);

    public abstract int convertChoiceToInt(String choice);
}

// return Integer.parseInt(choice);

