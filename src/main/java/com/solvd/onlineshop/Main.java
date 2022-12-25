package com.solvd.onlineshop;

import com.solvd.onlineshop.models.Cart;
import com.solvd.onlineshop.pages.ClothingPage;
import com.solvd.onlineshop.pages.FurniturePage;

import java.util.Scanner;

public class Main implements com.solvd.onlineshop.EnterUsername {
    // cart => someAddress
    static Cart cart = new Cart();
    static ClothingPage clothingPage = new ClothingPage(cart);
    static FurniturePage furniturePage = new FurniturePage(cart);

    Main main = new Main();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ask user for name

//        System.out.println("Enter customer name to continue:\n");
        System.out.println("Enter customer name to continue:\n");
        String username = sc.next();


        //when break, hit homepage.showPage();
        int currentPage = 0;
        while(currentPage !=  -1) {
            switch (currentPage) {
                case 0: //homepage
                    String greeting = "Welcome "  + username + "!\n" + "\n" + "Navigate menu to begin shopping";
                    System.out.println(greeting);
                    String options =  "\n\nStore System Menu \n"
                            + "0. Return to Homepage \n"
                            + "1. View Cart \n"
                            + "2. View Clothing Selection \n"
                            + "3. View Furniture Selection \n"
                            + "4. View Electronics Selection \n"
                            + "5. \n"
                            + "-1. Exit the program ";
                    System.out.println(options);
                    currentPage = sc.nextInt();
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



    private static int convertChoiceToInt(String choice) {
        return Integer.parseInt(choice);
    }
    @Override
    public void enterUsername(Scanner sc) {
        try {
            System.out.println("Enter customer name to continue:\n");
            String username = sc.next();
        }catch (Exception e) {
            System.out.println("Invalid input. Please enter a string.");
        }
}
}
