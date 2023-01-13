package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.functionalinterfaces.FormatInput;

import java.util.Scanner;

import static com.solvd.onlineshop.pages.Page.logger;

public class HomePage {

    public FormatInput formatInput;

    public int showPage(Scanner sc, String username) {
        String greeting = "Welcome "  + username + "!\n" + "\n" + "Navigate menu to begin shopping";
//        //makes choice case insensitive
//        this.formatInput.format(username);
        System.out.println(greeting);
        String options =  "\n\nMAIN MENU \n"
                + "------------------- \n"
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
            } catch (Exception e) {
                logger.warning("Invalid input. Please enter an integer between -1 and 5." +
                        "\n\nMAIN MENU \n"
                        + "------------------- \n"
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
