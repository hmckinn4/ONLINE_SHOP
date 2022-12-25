package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.models.*;

import java.util.Arrays;
import java.util.Scanner;

public class ClothingPage extends Page {

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
            System.out.println("Do you want to add to cart? Yes or No to go back to main page:");
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart( jacket );
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


            Shirt shirt = new Shirt(Shirt.PRICE, materialChoice,colorChoice,brandChoice,sizeChoice,bSleeveChoice);
            System.out.println(shirt);
            System.out.println("\nDo you want to add to cart? Yes or No to go back to main page:");
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart( shirt );
                return 1;
            }
            // TODO throw invalid entry exception
        }
//
//        if (choice.equals("Pants")) {
//            System.out.print("Sizes:");
//            System.out.println(Arrays.toString(Pants.SIZES));
//            String sizeChoice = chooseClothingParams(sc, Pants.SIZES, "sizes");
//
//
//            System.out.print("Color:");
//            System.out.println(Arrays.toString(Pants.COLORS));
//            String colorChoice = chooseClothingParams(sc, Pants.COLORS, "colors");
//
//
//            System.out.println("Enter waist-size:");
//            System.out.println(Arrays.toString(Pants.WAISTSIZE));
//            String waistSize = chooseClothingParams(sc,Pants.WAISTSIZE, "waist-size");
//
//            System.out.println("Do you want zip-up?:");
//            System.out.println(Arrays.toString(Pants.MATERIAL));
//            String materialChoice = chooseClothingParams(sc,Pants.MATERIAL, "Fabric Material");
//
//
//            System.out.println("Enter your waist-size:");
//            Integer waistSize;
////            String stripesChoice;
////            String[] zipOptions = {"Yes", "No"};
////            boolean stripeChoice;
////            stripesChoice = chooseClothingParams(sc, zipOptions, "Zip-Up (Yes or No)");
////            stripeChoice = convertChoiceToBool(stripesChoice);
//
//            Pants pants = new Pants(3, Pants.PRICE, colorChoice, sizeChoice, materialChoice, waistSize);
//            System.out.println("Do you want to add to cart? Yes or No to go back to main page:");
//            System.out.println(pants);
//            String addToCartChoice = sc.next();
//            if (addToCartChoice.equals("Yes")) {
//                cart.addCart( pants );
//                return 1;
//            }
//            // TODO throw invalid entry exception
//        }
        return 0;
    }

    @Override
    protected boolean convertChoiceToBool(String choice) {
        if(choice.equals("Yes")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String chooseClothingParams(Scanner sc, String[] validOptions, String choicetype) {
        boolean isValid = false;
        String choice = null;
        while (!isValid) {
            System.out.println("Enter preferred parameter of" + choicetype + ":");
            choice = sc.next();
            for (String param : validOptions) {
                if (choice.equals(param))
                    isValid = true;
            }
            if (isValid == false) {
                System.out.println("Please Input Valid Entry");
            }
        }
        return choice;
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

//   public Jacket generateJacket(int size, int color){
//       //pass needed options
//
//        }







