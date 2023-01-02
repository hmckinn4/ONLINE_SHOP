package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.interfaces.PageDisplay;
import com.solvd.onlineshop.models.Clothing;
import com.solvd.onlineshop.models.Jacket;
import com.solvd.onlineshop.models.Pants;
import com.solvd.onlineshop.models.Shirt;

import java.util.Arrays;
import java.util.Scanner;

public class ClothingPage extends Page implements PageDisplay {

    //need convert user choice of parameters to ID;
    // convert from jacket

    //user choose something and get needed parameter from hashmap
    private Cart cart;

    public ClothingPage(Cart cart) {
        this.cart = cart;
    }

    @Override
    public int showPage(Scanner sc) {

        System.out.println("Type name of Item to Browse: \n" +
                "Example: Jackets" + "\n" +
                "Jackets: $" + Jacket.PRICE + "\n" +
                "Shirts: $" + Shirt.PRICE + "\n" +
                "Pants: $" + Pants.PRICE + "\n");
        String choice = sc.next();

        if (choice.equals("Jackets")) {
            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Clothing.TOPSIZES));
            String sizeChoice = chooseClothingParams(sc, Clothing.TOPSIZES, "sizes");


            System.out.print("Color:");
            System.out.println(Arrays.toString(Clothing.TOPCOLORS));
            String colorChoice = chooseClothingParams(sc, Clothing.TOPCOLORS, "colors");

            System.out.print("Material:");
            System.out.println(Arrays.toString(Jacket.MATERIAL));
            String materialChoice = chooseClothingParams(sc, Jacket.MATERIAL, "material");

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Jacket.BRAND));
            String brandChoice = chooseClothingParams(sc, Jacket.BRAND, "brand");


            System.out.println("Do you want pockets?:");
            String pocketChoice;
            String[] pocketOptions = {"Yes", "No"};
            boolean bPocketChoice;
            pocketChoice = chooseClothingParams(sc, pocketOptions, "Pockets (Yes or No)");
            bPocketChoice = convertChoiceToBool(pocketChoice);

            System.out.println("Do you want zip-up?:");
            String zipChoice;
            String[] zipOptions = {"Yes", "No"};
            boolean bZipperChoice;
            zipChoice = chooseClothingParams(sc, zipOptions, "Zip-Up (Yes or No)");
            bZipperChoice = convertChoiceToBool(zipChoice);


            Jacket jacket = new Jacket(Jacket.PRICE,
                    materialChoice,
                    colorChoice,
                    brandChoice,
                    sizeChoice,
                    bPocketChoice,
                    bZipperChoice);
            System.out.println(jacket);
            System.out.println("\nDo you want to add to cart? Yes or No to go back to main page:");
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(jacket);
                return 1;
            }

            // TODO throw invalid entry exception
        }

        if (choice.equals("Shirts")) {
            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Clothing.TOPSIZES));
            String sizeChoice = chooseClothingParams(sc, Clothing.TOPSIZES, "sizes");


            System.out.print("Color:");
            System.out.println(Arrays.toString(Clothing.TOPCOLORS));
            String colorChoice = chooseClothingParams(sc, Clothing.TOPCOLORS, "colors");

            System.out.print("Material:");
            System.out.println(Arrays.toString(Shirt.MATERIAL));
            String materialChoice = chooseClothingParams(sc, Shirt.MATERIAL, "material");

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Shirt.BRAND));
            String brandChoice = chooseClothingParams(sc, Shirt.BRAND, "brand");


            System.out.println("Do you want short sleeve?:");
            String sleeveChoice;
            String[] sleeveOptions = {"Yes", "No"};
            boolean bSleeveChoice;
            sleeveChoice = chooseClothingParams(sc, sleeveOptions, " pocket choice (Yes or No)");
            bSleeveChoice = convertChoiceToBool(sleeveChoice);


            Shirt shirt = new Shirt(Shirt.PRICE, materialChoice, colorChoice, brandChoice, sizeChoice, bSleeveChoice);
            System.out.println(shirt);
            System.out.println("\nDo you want to add to cart? Yes or No to go back to main page:");
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(shirt);
                return 1;
            }
            // TODO throw invalid entry exception
        }

        if (choice.equals("Pants")) {
            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Pants.BOTTOMSWAISTSIZE));
            String[] sizes = new String[Pants.BOTTOMSWAISTSIZE.length];
            for (int i = 0; i < Pants.BOTTOMSWAISTSIZE.length; i++) {
                sizes[i] = Integer.toString(Pants.BOTTOMSWAISTSIZE[i]);
            }
            String sizeChoice = chooseClothingParams(sc, sizes, "sizes");
            int size = convertChoiceToInt(sizeChoice);


            System.out.print("Color:");
            System.out.println(Arrays.toString(Pants.COLORS));
            String colorChoice = chooseClothingParams(sc, Pants.COLORS, "colors");

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Pants.BRANDS));
            String brandChoice = chooseClothingParams(sc, Pants.BRANDS, "brand");


            System.out.println("Type preferred material:");
            System.out.println(Arrays.toString(Pants.MATERIAL));
            String materialChoice = chooseClothingParams(sc, Pants.MATERIAL, "Material");


            Pants pants = new Pants(Pants.PRICE, materialChoice, colorChoice, brandChoice, size);
            System.out.println(pants);
            System.out.println("\nDo you want to add to cart? Yes or No to go back to main page:");
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(pants);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        return 0;
    }

    @Override
    protected boolean convertChoiceToBool(String choice) throws NullPointerException {
        if (choice == null) {
            throw new NullPointerException("Choice is null");
        }
        if (choice.equals("Yes")) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String chooseClothingParams(Scanner sc, String[] validOptions, String choicetype) {
        boolean returnToMainMenu = false;
        while (returnToMainMenu == false) {
            boolean isValid = false;
            String choice = null;
            while (!isValid) {
                System.out.println("\nEnter preferred parameter of " + choicetype + "\n" + "Enter Homepage to return to Main Menu");
                choice = sc.next();
                if (choice.equals("Homepage")) {
                    // Set returnToMainMenu to true to break out of the loop
                    returnToMainMenu = true;
                    // Break out of the inner loop
                    break;
                }
                // Check if the choice is a valid option
                for (String param : validOptions) {
                    if (choice.equals(param)) {
                        isValid = true;
                        break;
                    }
                }
                if (isValid == false) {
                    logger.warning("Please Input Valid Entry");
                }
            }
            // Return the user's choice if it is a valid option and they did not enter 0 to return to the main menu
            if (returnToMainMenu == false) {
                return choice;
            }
        }
        // Return null if the user entered 0 to return to the main menu
        return null;
    }




    @Override
    public int convertChoiceToInt(String choice) {
        int size = 0;
        try {
            // Try to parse the choice string as an integer
            size = Integer.parseInt(choice);
        } catch (NumberFormatException e) {
            // If the choice string is not an integer, handle the error
            logger.warning(" Please enter a valid integer size.");
        }

        // Check if the size is in the BOTTOMSWAISTSIZE array
        for (int i = 0; i < Pants.BOTTOMSWAISTSIZE.length; i++) {
            if (size == Pants.BOTTOMSWAISTSIZE[i]) {
                return size;
            }
        }

        // If the size is not in the BOTTOMSWAISTSIZE array, return 0
        return 0;
    }

    @Override
    public int ShowPage() {
        return 0;
    }

    @Override
    public boolean convertChoiceToBool() {
        return false;
    }

    @Override
    public String chooseClothingParams() {
        return null;
    }
}








