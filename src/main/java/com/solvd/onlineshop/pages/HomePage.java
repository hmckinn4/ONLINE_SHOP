package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.exceptions.InvalidEntryLength;
import com.solvd.onlineshop.functionalinterfaces.FormatInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class HomePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);
    public FormatInput formatInput = (String s) -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

    public int showPage(Scanner sc, String username) {
        while (true) {
            if (username.length() < 3) {
                try {
                    throw new InvalidEntryLength("Please enter a valid username (at least 3 characters)");
                } catch (InvalidEntryLength e) {
                    logger.trace("Please enter a valid username (at least 3 characters)");
                }
            } else if (username.length() >= 3) {
                break;
            }
        }
        //format the username
        username = formatInput.format(username);
        String greeting = "Welcome " + username + "!\n" + "\n" + "Navigate menu to begin shopping";
        System.out.println(greeting);
        String options = "\n\nMAIN MENU \n"
                + "------------------- \n"
                + "0. Return to Homepage \n"
                + "1. View Cart \n"
                + "2. View Clothing Selection \n"
                + "3. View Furniture Selection \n"
                + "4. Checkout \n"
                + "-1. Exit the program ";
        System.out.println(options);

        int currentPage;
        while (true) {
            try {
                currentPage = sc.nextInt();
                if (currentPage >= -1 && currentPage <= 5) {
                    break;
                } else {
                    throw new Exception("Invalid input. Please enter an integer between -1 and 5.");
                }
            } catch (Exception e) {
                logger.info("Invalid input. Please enter an integer between -1 and 5." +
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
