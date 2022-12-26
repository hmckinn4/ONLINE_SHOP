package com.solvd.onlineshop;

import com.solvd.onlineshop.exceptions.UsernameException;
import com.solvd.onlineshop.interfaces.EnterUsername;
import com.solvd.onlineshop.pages.Cart;
import com.solvd.onlineshop.pages.ClothingPage;
import com.solvd.onlineshop.pages.FurniturePage;
import com.solvd.onlineshop.pages.HomePage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main implements EnterUsername {
    public static String username = null;
    static Cart cart = new Cart();
    static ClothingPage clothingPage = new ClothingPage(cart);
    static FurniturePage furniturePage = new FurniturePage(cart);


    public static void main(String[] args) throws UsernameException {
        Scanner sc = new Scanner(System.in);
        //ask user for name

//        System.out.println("Enter customer name to continue:\n");
        String username = enterUsername(sc);


        //when break, hit homepage.showPage();
        int currentPage = 0;
        while(currentPage !=  -1) {
            switch (currentPage) {
                case 0: //homepage
                    currentPage = HomePage.showPage(sc, username);
//                    String greeting = "Welcome "  + username + "!\n" + "\n" + "Navigate menu to begin shopping";
//                    System.out.println(greeting);
//                    String options =  "\n\nStore System Menu \n"
//                            + "0. Return to Homepage \n"
//                            + "1. View Cart \n"
//                            + "2. View Clothing Selection \n"
//                            + "3. View Furniture Selection \n"
//                            + "4. View Electronics Selection \n"
//                            + "5. \n"
//                            + "-1. Exit the program ";
//                    System.out.println(options);
//                    while (true) {
//                        try {
//                    currentPage = sc.nextInt();
//                    if(currentPage >= -1 && currentPage <= 5) {
//                        break;
//                    }
//                    else {
//                        throw new Exception("Invalid input. Please enter an integer between -1 and 5.");
//                    }
//                        } catch (InputMismatchException e) {
//
//                            System.out.println("Invalid input. Please enter a valid integer."
//                                    +
//
//                                    "\n\nStore System Menu \n"
//                                            + "0. Return to Homepage \n"
//                                            + "1. View Cart \n"
//                                            + "2. View Clothing Selection \n"
//                                            + "3. View Furniture Selection \n"
//                                            + "4. View Electronics Selection \n"
//                                            + "5. \n"
//                                            + "-1. Exit the program ");
//                            sc.next(); // consume the invalid input
//                        } catch (Exception e) {
//                            System.out.println("Invalid input. Please enter an integer between -1 and 5." +
//                                    "\n\nStore System Menu \n"
//                                    + "0. Return to Homepage \n"
//                                    + "1. View Cart \n"
//                                    + "2. View Clothing Selection \n"
//                                    + "3. View Furniture Selection \n"
//                                    + "4. View Electronics Selection \n"
//                                    + "5. \n"
//                                    + "-1. Exit the program ");
//                            sc.next(); // consume the invalid input
//                        }
//                    }
                    //TODO if they dont enter the proper integers, ask to reenter
                    break;
                case 1: // cart page
                    currentPage = cart.showPage();
                    break;
                case 2: // Display Clothes Options
                    // call a mthod in clothingpage that asks the user a question
                    currentPage = clothingPage.showPage(sc);
                    break;
                case 3:
                    //Display Furniture Options
                    currentPage = furniturePage.showPage(sc);
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

    public static String enterUsername(Scanner sc) throws UsernameException {
        String username = null;
        boolean status = true;
        while(status) {
            try {
                System.out.print("Enter customer name: ");
                username = sc.nextLine();

                // Use a regular expression to check for numeric characters
                Pattern pattern = Pattern.compile("\\d");
                Matcher matcher = pattern.matcher(username);

                if (matcher.find()) {
                    throw new UsernameException("Customer name cannot contain numbers");
                }

                status = false;
            } catch (UsernameException e) {
                System.out.println(e.getMessage());
            }
        }
        return username;
    }
}
