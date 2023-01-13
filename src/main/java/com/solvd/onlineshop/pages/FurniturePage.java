package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.enums.Brand;
import com.solvd.onlineshop.enums.Colors;
import com.solvd.onlineshop.enums.Material;
import com.solvd.onlineshop.exceptions.InvalidProductParameterException;
import com.solvd.onlineshop.models.Chair;
import com.solvd.onlineshop.models.Couch;
import com.solvd.onlineshop.models.Furniture;
import com.solvd.onlineshop.models.Table;

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
                "Example: Couch" + "\n" +
                "Couch: $" + Couch.PRICE + "\n" +
                "Chair: $" + Chair.PRICE + "\n" +
                "Table: $" + Table.PRICE + "\n");
        String choice = sc.next();
        choice = this.formatInput.format(choice);

        if (choice.equals("Couch")) {

            System.out.print("Color:");
            System.out.println(Arrays.toString(Couch.COLORS));
            //Converting user input to enum
            String[] colorsAsString = new String[]{"Beige","Maroon","Black"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Beige")){
                color = Colors.BEIGE;
            }else if(colorChoice.equals("Maroon")){
                color = Colors.MAROON;
            }else if(colorChoice.equals("Black")){
                color = Colors.BLACK;
            }

            System.out.print("Material:");
            System.out.println(Arrays.toString(Furniture.MATERIAL));
            //convert user input to enum
            String[] materialAsString = new String[]{"Metal", "Wood", "Plastic"};

            String materialChoice = this.chooseProductParams(sc, materialAsString, "Material");
            Material material = Material.METAL;
            if(materialChoice.equals("Wood")){
                material = Material.WOOD;
            }else if(materialChoice.equals("Metal")){
                material = Material.METAL;
            }else if(materialChoice.equals("Plastic")){
                material = Material.PLASTIC;
            }

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Furniture.BRAND));
            //convert user input to enum
            String[] brandAsString = new String[]{"Walmart", "Ikea", "Restoration_Hardware"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "Material");
            Brand brand = Brand.IKEA;
            if(brandChoice.equals("Restoration_Hardware")){
                brand = Brand.RESTORATION_HARDWARE;
            }else if(brandChoice.equals("Ikea")){
                brand = Brand.IKEA;
            }else if(brandChoice.equals("Walmart")){
                brand = Brand.WALMART;
            }

            System.out.println("Do you want cup holders?:");
            String cupHolderChoice;
            String[] cupHolderOptions = {"Yes", "No"};
            boolean bcupHolderChoice;
            cupHolderChoice = this.chooseProductParams(sc, cupHolderOptions, " Cup holders? (Yes or No)");
            bcupHolderChoice = convertChoiceToBool(cupHolderChoice);


            Couch couch = new Couch(Couch.PRICE,
                    material,
                    color,
                    brand,
                    bcupHolderChoice);
            System.out.println(couch);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(couch);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        if (choice.equals("Chair")) {

            System.out.print("Color:");
            System.out.println(Arrays.toString(Chair.COLORS));
            //Converting user input to enum
            String[] colorsAsString = new String[]{"Beige","Maroon","Black"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Beige")){
                color = Colors.BEIGE;
            }else if(colorChoice.equals("Maroon")){
                color = Colors.MAROON;
            }else if(colorChoice.equals("Black")){
                color = Colors.BLACK;
            }


            System.out.print("Material:");
            System.out.println(Arrays.toString(Furniture.MATERIAL));

            //convert user input to enum
            String[] materialAsString = new String[]{"Metal", "Wood", "Plastic"};

            String materialChoice = this.chooseProductParams(sc, materialAsString, "Material");
            Material material = Material.METAL;
            if(materialChoice.equals("Wood")){
                material = Material.WOOD;
            }else if(materialChoice.equals("Metal")){
                material = Material.METAL;
            }else if(materialChoice.equals("Plastic")){
                material = Material.PLASTIC;
            }


            System.out.print("Brand:");
            System.out.println(Arrays.toString(Furniture.BRAND));
            //convert user input to enum
            String[] brandAsString = new String[]{"Walmart", "Ikea", "Restoration_Hardware"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "Material");
            Brand brand = Brand.IKEA;
            if(brandChoice.equals("Restoration_Hardware")){
                brand = Brand.RESTORATION_HARDWARE;
            }else if(brandChoice.equals("Ikea")){
                brand = Brand.IKEA;
            }else if(brandChoice.equals("Walmart")){
                brand = Brand.WALMART;
            }

            System.out.println("Do you want cup holders?:");
            String cupHolderChoice;
            String[] cupHolderOptions = {"Yes", "No"};
            boolean bcupHolderChoice;
            cupHolderChoice = this.chooseProductParams(sc, cupHolderOptions, " Cup holders? (Yes or No)");
            bcupHolderChoice = convertChoiceToBool(cupHolderChoice);

            System.out.println("Do you want the recline option?:");
            String reclineChoice;
            String[] reclineOptions = {"Yes", "No"};
            boolean bReclineChoice;
            reclineChoice = this.chooseProductParams(sc, reclineOptions, " Reclines? (Yes or No)");
            bReclineChoice = convertChoiceToBool(reclineChoice);


            Chair chair = new Chair(Chair.PRICE,
                    material,
                    color,
                    brand,
                    bcupHolderChoice,
                    bReclineChoice);
            System.out.println(chair);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(chair);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        if (choice.equals("Table")) {

            System.out.print("Color:");
            System.out.println(Arrays.toString(Table.COLORS));
            //Converting user input to enum
            String[] colorsAsString = new String[]{"Oak","White","Gray"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Oak")){
                color = Colors.OAK;
            }else if(colorChoice.equals("White")){
                color = Colors.WHITE;
            }else if(colorChoice.equals("Gray")){
                color = Colors.GRAY;
            }


            System.out.print("Material:");
            System.out.println(Arrays.toString(Furniture.MATERIAL));
            //convert user input to enum
            String[] materialAsString = new String[]{"Metal", "Wood", "Plastic"};

            String materialChoice = this.chooseProductParams(sc, materialAsString, "Material");
            Material material = Material.METAL;
            if(materialChoice.equals("Wood")){
                material = Material.WOOD;
            }else if(materialChoice.equals("Metal")){
                material = Material.METAL;
            }else if(materialChoice.equals("Plastic")){
                material = Material.PLASTIC;
            }


            System.out.print("Brand:");
            System.out.println(Arrays.toString(Furniture.BRAND));
            //convert user input to enum
            String[] brandAsString = new String[]{"Walmart", "Ikea", "Restoration_Hardware"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "Material");
            Brand brand = Brand.IKEA;
            if(brandChoice.equals("Restoration_Hardware")){
                brand = Brand.RESTORATION_HARDWARE;
            }else if(brandChoice.equals("Ikea")){
                brand = Brand.IKEA;
            }else if(brandChoice.equals("Walmart")){
                brand = Brand.WALMART;
            }

            System.out.println("Do you want cup holders?:");
            String cupHolderChoice;
            String[] cupHolderOptions = {"Yes", "No"};
            boolean bcupHolderChoice;
            cupHolderChoice = this.chooseProductParams(sc, cupHolderOptions, " Cup holders? (Yes or No)");
            bcupHolderChoice = convertChoiceToBool(cupHolderChoice);


            Table table = new Table(Chair.PRICE,
                    material,
                    color,
                    brand,
                    bcupHolderChoice);
            System.out.println(table);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);

            if (addToCartChoice.equals("Yes")) {
                cart.addCart(table);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        return 0;
    }
        @Override
        public boolean convertChoiceToBool(String choice) {
            if(choice.equals("Yes")){
                return true;
            } else {
                return false;
            }
        }

    @Override
    public String chooseProductParams(Scanner sc, String[] validOptions, String parameterName) {
        while (true) {
            try {
                System.out.print("\nEnter " + parameterName + " : ");
                String choice = sc.next();
                choice = this.formatInput.format(choice);
                for (String option : validOptions) {
                    if (choice.equals(option)) {
                        return choice;
                    }
                }
                throw new InvalidProductParameterException("Error: Invalid " + parameterName + ", please enter a valid " + parameterName + "\n"
                        + "Valid " + parameterName + ": " + Arrays.toString(validOptions));
            } catch (InvalidProductParameterException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public int convertChoiceToInt(String choice) {
        return 0;
    }


}


