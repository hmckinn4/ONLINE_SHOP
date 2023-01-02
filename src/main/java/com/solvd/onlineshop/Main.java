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

import static com.solvd.onlineshop.pages.Page.logger;

public class Main implements EnterUsername {
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
                    break;
                case 1: // cart page
                    currentPage = cart.showCart();
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
                    double payment = 0;
                    currentPage = (int) cart.checkOut(cart,payment);
                    break;
                case 5:
                    break;
                default:
                    logger.warning("Invalid selection. Returning to main menu.");
                    currentPage = 0;
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
