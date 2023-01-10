package com.solvd.onlineshop.interfaces;

import java.util.Scanner;

public interface PageDisplay {

    public int showPage(Scanner sc);

    public boolean convertChoiceToBool(String choice) throws NullPointerException;

    public String chooseClothingParams(Scanner sc, String[] validOptions, String choicetype);

}
