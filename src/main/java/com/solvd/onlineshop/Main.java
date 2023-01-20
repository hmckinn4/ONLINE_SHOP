package com.solvd.onlineshop;

import com.solvd.onlineshop.exceptions.UsernameNumberException;
import com.solvd.onlineshop.functionalinterfaces.FormatInput;
import com.solvd.onlineshop.functionalinterfaces.ValidateInput;
import com.solvd.onlineshop.pages.Cart;
import com.solvd.onlineshop.pages.ClothingPage;
import com.solvd.onlineshop.pages.FurniturePage;
import com.solvd.onlineshop.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




//import static com.solvd.onlineshop.pages.Page.logger;

public class Main{
    static Cart cart = new Cart();
    static ClothingPage clothingPage = new ClothingPage();
    static FurniturePage furniturePage = new FurniturePage(cart);
    static HomePage homePage = new HomePage();

    private static final Logger logger = LogManager.getLogger(Main.class);


    public FormatInput formatInput = (String s) -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

   public static ValidateInput validateInput = (Scanner i) -> {
        try {
            Integer.parseInt(String.valueOf(i));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    };


    public static void main(String[] args) throws UsernameNumberException {
        Scanner sc = new Scanner(System.in);
        //ask user for name
        String username = enterUsername(sc);
        String.format(username);
        //makes choice case insensitive


        //when break, hit homepage.showPage();
        int currentPage = 0;
        while(currentPage !=  -1) {
            switch (currentPage) {
                case 0: //homepage
                    currentPage = homePage.showPage(sc, username);
                    break;
                case 1: // cart page
                    currentPage = cart.showCart(sc);
                    break;
               case 2:// Display Clothes Options
                   // call a method in clothingpage that asks the user a question
                   currentPage = clothingPage.showPage(sc, cart);
                   break;
                case 3:
                    //Display Furniture Options
                    currentPage = furniturePage.showPage(sc, cart);
                    break;
                case 4:
                    double payment = 0;
                    currentPage = (int) cart.checkOut(cart,payment, sc);
                    break;
                case 5:
                    break;
                default:
                    logger.warn("Invalid selection. Returning to main menu.");
                    currentPage = 0;
                    break;
            }
        }
    }

    public static String enterUsername(Scanner sc) throws UsernameNumberException {
        String username = null;
        boolean status = true;
        while(status) {
            try {
                logger.trace("\nEnter customer name: ");
                username = sc.nextLine();
//                username = this.formatInput.format(username);

                // Use a regular expression to check for numeric characters
                Pattern pattern = Pattern.compile("\\d");
                Matcher matcher = pattern.matcher(username);

                if (matcher.find()) {
                    throw new UsernameNumberException("Customer name cannot contain numbers");
                } if (username.length() < 3) {
                    throw new UsernameNumberException("Customer name must be at least 3 characters");
                }

                status = false;
            } catch (UsernameNumberException e) {
                logger.debug(e.getMessage());
            }

        }
        return username;
    }

}
