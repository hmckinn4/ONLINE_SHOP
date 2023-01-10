package com.solvd.onlineshop.pages;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.solvd.onlineshop.pages.Page.logger;

public class HomePage {

    public static int showPage(Scanner sc, String username) {
        String greeting = "Welcome "  + username + "!\n" + "\n" + "Navigate menu to begin shopping";
        System.out.println(greeting);
        String options =  "\n\nStore System Menu \n"
                + "0. Return to Homepage \n"
                + "1. View Cart \n"
                + "2. View Clothing Selection \n"
                + "3. View Furniture Selection \n"
                + "4. Checkout \n"
                + "-1. Exit the program ";
        System.out.println(options);

        // Add a while loop here to handle invalid input as before
        int currentPage;
        while (true) {
            try {
                currentPage = sc.nextInt();
                if(currentPage >= -1 && currentPage <= 5) {
                    break;
                }
                else {
                    throw new Exception("Invalid input. Please enter an integer between -1 and 5.");
                }
            } catch (InputMismatchException e) {
                logger.warning("Invalid input. Please enter a valid integer.");
            } catch (Exception e) {
                logger.warning("Invalid input. Please enter an integer between -1 and 5." +
                        "\n\nStore System Menu \n"
                        + "0. Return to Homepage \n"
                        + "1. View Cart \n"
                        + "2. View Clothing Selection \n"
                        + "3. View Furniture Selection \n"
                        + "4. Checkout \n"
                        + "-1. Exit the program ");
            }
        }
        return currentPage;
    }
}
