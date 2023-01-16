package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.enums.*;
import com.solvd.onlineshop.exceptions.InvalidProductException;
import com.solvd.onlineshop.exceptions.InvalidProductParameterException;
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
//    private Cart cart;

//    public ClothingPage(Cart cart) {
//        this.cart = cart;
//    }

    @Override
    public int showPage(Scanner sc, Cart cart) {

        System.out.println("Type name of Item to Browse: \n" +
                "Example: Jackets" + "\n" +
                "Jackets: $" + Jacket.PRICE + "\n" +
                "Shirts: $" + Shirt.PRICE + "\n" +
                "Pants: $" + Pants.PRICE + "\n");
        String choice = sc.next();
        choice = this.formatInput.format(choice);

        try {
            if (!choice.equals("Jackets") && !choice.equals("Shirts") && !choice.equals("Pants")) {
                throw new InvalidProductException("Error: Invalid product choice, please enter a valid product choice. ");
            }
        } catch (InvalidProductException e) {
            logger.warning(e.getMessage());
            return 2;
        }

        if (choice.equals("Jackets")) {
            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Clothing.TOPSIZES));

            //Converting user input to enum
            String[] sizesAsString = new String[]{"Small", "Medium", "Large", "X-Large"};

            String sizeChoice = this.chooseProductParams(sc, sizesAsString, "sizes");
//            for(Size size : Size.values()) {
//                if(sizeChoice.equals(size.toString())) {
//                    sizeChoice = size.toString();
//                }
//            }
            Size size = Size.SMALL;
            if( sizeChoice.equals("S") ) {
                size = Size.SMALL;
            } else if( sizeChoice.equals("M") ) {
                size = Size.MEDIUM;
            } else if( sizeChoice.equals("L") ) {
                size = Size.LARGE;
            } else if( sizeChoice.equals("XL") ) {
                size = Size.EXTRA_LARGE;
            }


            System.out.print("Color:");
            System.out.println(Arrays.toString(Clothing.TOPCOLORS));

            //Converting user input to enum
            String[] colorsAsString = new String[]{"Red", "Blue", "Green"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Red")) {
                color = Colors.RED;
            } else if(colorChoice.equals("Blue")) {
                color = Colors.BLUE;
            } else if(colorChoice.equals("Green")) {
                color = Colors.GREEN;
            }

            System.out.print("Material:");
            System.out.println(Arrays.toString(Jacket.MATERIAL));

            //Converting user input to enum
            String[] materialsAsString = new String[]{"Cotton", "Polyester", "Leather"};

            String materialChoice = this.chooseProductParams(sc, materialsAsString, "material");
            Material material = Material.COTTON;
            if( materialChoice.equals("Cotton") ) {
                material = Material.COTTON;
            } else if( materialChoice.equals("Polyester") ) {
                material = Material.POLYESTER;
            } else if( materialChoice.equals("Leather") ) {
                material = Material.LEATHER;
            }


            System.out.print("Brand:");
            System.out.println(Arrays.toString(Jacket.BRAND));
            //Converting user input to enum
            String[] brandAsString = new String[]{"Canada-Goose", "Gucci", "Louis-Vuitton"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "brand");
            Brand brand = Brand.CANADA_GOOSE;
            if(brandChoice.equals("Canada-Goose")) {
                brand = Brand.CANADA_GOOSE;
            } else if(brandChoice.equals("Gucci")) {
                brand = Brand.GUCCI;
            } else if(brandChoice.equals("Louis-Vuitton")) {
                brand = Brand.LOUIS_VUITTON;
            }


            System.out.println("Do you want pockets?:");
            String pocketChoice;
            String[] pocketOptions = {"Yes", "No"};
            boolean bPocketChoice;
            pocketChoice = this.chooseProductParams(sc, pocketOptions, "Pockets (Yes or No)");
            bPocketChoice = convertChoiceToBool(pocketChoice);

            System.out.println("Do you want zip-up?:");
            String zipChoice;
            String[] zipOptions = {"Yes", "No"};
            boolean bZipperChoice;
            zipChoice = this.chooseProductParams(sc, zipOptions, "Zip-Up (Yes or No)");
            bZipperChoice = convertChoiceToBool(zipChoice);


            Jacket jacket = new Jacket(Jacket.PRICE,
                    material,
                    color,
                    brand,
                    size,
                    bPocketChoice,
                    bZipperChoice);
            System.out.println(jacket);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(jacket);
                return 1;
            }

            // TODO throw invalid entry exception
        }

        if (choice.equals("Shirts")) {

            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Clothing.TOPSIZES));
            String[] sizesAsString = new String[]{"Small", "Medium", "Large", "Extra-Large"};

            String sizeChoice = this.chooseProductParams(sc, sizesAsString, "sizes");
            Size size = Size.SMALL;
            if( sizeChoice.equals("S") ) {
                size = Size.SMALL;
            } else if( sizeChoice.equals("M") ) {
                size = Size.MEDIUM;
            } else if( sizeChoice.equals("L") ) {
                size = Size.LARGE;
            } else if( sizeChoice.equals("XL") ) {
                size = Size.EXTRA_LARGE;
            }


            System.out.print("Color:");
            System.out.println(Arrays.toString(Clothing.TOPCOLORS));
            //Converting user input to enum
            String[] colorsAsString = new String[]{"Red", "Blue", "Green"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Red")) {
                color = Colors.RED;
            } else if(colorChoice.equals("Blue")) {
                color = Colors.BLUE;
            } else if(colorChoice.equals("Green")) {
                color = Colors.GREEN;
            }

            System.out.print("Material:");
            System.out.println(Arrays.toString(Shirt.MATERIAL));
            //Converting user input to enum
            String[] materialsAsString = new String[]{"Cotton", "Polyester", "Silk"};

            String materialChoice = this.chooseProductParams(sc, materialsAsString, "material");
            Material material = Material.COTTON;
            if( materialChoice.equals("Cotton") ) {
                material = Material.COTTON;
            } else if( materialChoice.equals("Polyester") ) {
                material = Material.POLYESTER;
            } else if( materialChoice.equals("Silk") ) {
                material = Material.SILK;
            }

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Shirt.BRAND));
            //Converting user input to enum
            String[] brandAsString = new String[]{"Store-Brand", "Nike", "Louis-Vuitton"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "brand");
            Brand brand = Brand.NIKE;
            if(brandChoice.equals("Store-Brand")) {
                brand = Brand.STORE_BRAND;
            } else if(brandChoice.equals("Nike")) {
                brand = Brand.NIKE;
            } else if(brandChoice.equals("Louis-Vuitton")) {
                brand = Brand.LOUIS_VUITTON;
            }



            System.out.println("Do you want short sleeve?:");
            String sleeveChoice;
            String[] sleeveOptions = {"Yes", "No"};
            boolean bSleeveChoice;
            sleeveChoice = this.chooseProductParams(sc, sleeveOptions, " sleeve choice (Yes or No)");
            bSleeveChoice = convertChoiceToBool(sleeveChoice);


            Shirt shirt = new Shirt(Shirt.PRICE,
                    material,
                    color,
                    brand,
                    size,
                    bSleeveChoice);
            System.out.println(shirt);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(shirt);
                return 1;
            }
            // TODO throw invalid entry exception
        }

        if (choice.equals("Pants")) {
            System.out.print("Sizes:");
            System.out.println(Arrays.toString(Pants.BOTTOMSWAISTSIZE));
            //Converting user input to enum
            String[] sizesAsString = new String[]{"XS","S","M","L","XL","XXL"};

            String waistSizeChoice = this.chooseProductParams(sc, sizesAsString, "sizes");
            BottomWaistSize waistSize = BottomWaistSize.XS;
            if(waistSizeChoice.equals("XS")) {
                waistSize = BottomWaistSize.XS;
            } else if(waistSizeChoice.equals("S")) {
                waistSize = BottomWaistSize.S;
            } else if(waistSizeChoice.equals("M")) {
                waistSize = BottomWaistSize.M;
            } else if(waistSizeChoice.equals("L")) {
                waistSize = BottomWaistSize.L;
            } else if(waistSizeChoice.equals("XL")) {
                waistSize = BottomWaistSize.XL;
            } else if(waistSizeChoice.equals("XXL")) {
                waistSize = BottomWaistSize.XXL;
            }


//            String[] sizes = new String[Pants.BOTTOMSWAISTSIZE.length];
//            for (int i = 0; i < Pants.BOTTOMSWAISTSIZE.length; i++) {
//                sizes[i] = Integer.toString(Pants.BOTTOMSWAISTSIZE[i]);
//            }
//            String sizeChoice = chooseClothingParams(sc, sizes, "sizes");
//            int size = convertChoiceToInt(sizeChoice);


            System.out.print("Color:");
            System.out.println(Arrays.toString(Pants.COLORS));
            //Converting user input to enum
            String[] colorsAsString = new String[]{"Tan","Navy","Black"};

            String colorChoice = this.chooseProductParams(sc, colorsAsString, "colors");
            Colors color = Colors.RED;
            if(colorChoice.equals("Tan")) {
                color = Colors.TAN;
            } else if(colorChoice.equals("Navy")) {
                color = Colors.NAVY;
            } else if(colorChoice.equals("Black")) {
                color = Colors.BLACK;
            }

            System.out.print("Brand:");
            System.out.println(Arrays.toString(Pants.BRANDS));
            //Converting user input to enum
            String[] brandAsString = new String[]{"Levi", "J-Crew", "Louis-Vuitton"};

            String brandChoice = this.chooseProductParams(sc, brandAsString, "brand");
            Brand brand = Brand.LEVI;
            if(brandChoice.equals("Levi")) {
                brand = Brand.LEVI;
            } else if(brandChoice.equals("J-Crew")) {
                brand = Brand.J_CREW;
            } else if(brandChoice.equals("Louis-Vuitton")) {
                brand = Brand.LOUIS_VUITTON;
            }


            System.out.println("Type preferred material:");
            System.out.println(Arrays.toString(Pants.MATERIAL));
            //Converting user input to enum
            String[] materialsAsString = new String[]{"Cotton", "Polyester", "Silk"};

            String materialChoice = this.chooseProductParams(sc, materialsAsString, "material");
            Material material = Material.COTTON;
            if( materialChoice.equals("Cotton") ) {
                material = Material.COTTON;
            } else if( materialChoice.equals("Polyester") ) {
                material = Material.POLYESTER;
            } else if( materialChoice.equals("Silk") ) {
                material = Material.SILK;
            }


            Pants pants = new Pants(Pants.PRICE,
                    material,
                    color,
                    brand,
                    waistSize);
            System.out.println(pants);
            System.out.println("\nDo you want to add to cart (Yes)? Else, hit any key for home-page:");
            String addToCartChoice = sc.next();
            addToCartChoice = this.formatInput.format(addToCartChoice);
            if (addToCartChoice.equals("Yes")) {
                cart.addCart(pants);
                return 1;
            }
            // TODO throw invalid entry exception
        }
        return 0;
    }

    @Override
    public boolean convertChoiceToBool(String choice) throws NullPointerException {
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
        int size = 0;
        try {
            // Try to parse the choice string as an integer
            size = Integer.parseInt(choice);
        } catch (NumberFormatException e) {
            // If the choice string is not an integer, handle the error
            logger.warning(" Please enter a valid integer size.");
        }

        // Check if the size is in the BOTTOMSWAISTSIZE array
//        for (int i = 0; i < Pants.BOTTOMSWAISTSIZE.length; i++) {
//            if (size == Pants.BOTTOMSWAISTSIZE[i]) {
//                return size;
//            }
//        }

        // If the size is not in the BOTTOMSWAISTSIZE array, return 0
        return 0;
    }

}








