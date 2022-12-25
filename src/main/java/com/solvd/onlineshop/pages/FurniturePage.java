package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.models.*;

import java.util.Arrays;
import java.util.Scanner;

public class FurniturePage extends Page {

    //need convert user choice of parameters to ID;
    // convert from jacket

    //user choose something and get needed parameter from hashmap
    private Cart cart;

    public FurniturePage(Cart cart) {
        this.cart = cart;
    }

    @Override
    public int showPage(Scanner sc) {

        System.out.println("Type name of Item to Browse: \n" +
                "Example: Jackets" + "\n" +
                "Couch: $" + Couch.PRICE + "\n" +
                "Chair: $" + Chair.PRICE + "\n" +
                "Table: $" + Pants.PRICE + "\n");
        String choice = sc.next();

        if (choice.equals("Couch")) {

            System.out.print("Color:");
            System.out.println(Arrays.toString(Couch.COLORS));
            String colorChoice = chooseClothingParams(sc, Couch.COLORS, "colors");

            System.out.print("Material:");
            System.out.println(Arrays.toString(Furniture.MATERIAL));
            String materialchoice = chooseClothingParams(sc, Furniture.MATERIAL, "material");

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Furniture.BRAND));
            String brandChoice = chooseClothingParams(sc, Furniture.BRAND, "material");

            System.out.println("Do you want cup holders?:");
            String cupHolderChoice;
            String[] cupHolderOptions = {"Yes", "No"};
            boolean bcupHolderChoice;
            cupHolderChoice = chooseClothingParams(sc, cupHolderOptions, " Cup holders? (Yes or No)");
            bcupHolderChoice = convertChoiceToBool(cupHolderChoice);


            Couch couch = new Couch(Couch.PRICE,materialchoice,colorChoice,brandChoice,bcupHolderChoice);
            System.out.println("Do you want to add to cart? Yes or No to go back to main page:");
            System.out.println(couch);
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(couch);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        if (choice.equals("Chair")) {

            System.out.print("Color:");
            System.out.println(Arrays.toString(Chair.COLORS));
            String colorChoice = chooseClothingParams(sc, Chair.COLORS, "colors");

            System.out.print("Material:");
            System.out.println(Arrays.toString(Furniture.MATERIAL));
            String materialchoice = chooseClothingParams(sc, Furniture.MATERIAL, "material");

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Furniture.BRAND));
            String brandChoice = chooseClothingParams(sc, Furniture.BRAND, "material");

            System.out.println("Do you want cup holders?:");
            String cupHolderChoice;
            String[] cupHolderOptions = {"Yes", "No"};
            boolean bcupHolderChoice;
            cupHolderChoice = chooseClothingParams(sc, cupHolderOptions, " Cup holders? (Yes or No)");
            bcupHolderChoice = convertChoiceToBool(cupHolderChoice);

            System.out.println("Do you want the recline option?:");
            String reclineChoice;
            String[] reclineOptions = {"Yes", "No"};
            boolean bReclineChoice;
            reclineChoice = chooseClothingParams(sc, reclineOptions, " Reclines? (Yes or No)");
            bReclineChoice = convertChoiceToBool(reclineChoice);




            Chair chair = new Chair(Chair.PRICE,materialchoice,colorChoice,brandChoice,bcupHolderChoice,bReclineChoice);
            System.out.println("Do you want to add to cart? Yes or No to go back to main page:");
            System.out.println(chair);
            String addToCartChoice = sc.next();
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(chair);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        return 0;
    }

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


