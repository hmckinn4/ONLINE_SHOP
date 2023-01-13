package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.exceptions.InsufficientPaymentException;
import com.solvd.onlineshop.functionalinterfaces.DiscountCalculator;
import com.solvd.onlineshop.functionalinterfaces.FormatInput;
import com.solvd.onlineshop.interfaces.AddtoCart;
import com.solvd.onlineshop.interfaces.CheckOut;
import com.solvd.onlineshop.interfaces.RemoveFromCart;
import com.solvd.onlineshop.interfaces.ShowCart;
import com.solvd.onlineshop.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

import static com.solvd.onlineshop.pages.Page.logger;

public class Cart implements AddtoCart, RemoveFromCart, CheckOut, ShowCart {
    public ArrayList<Product> productInCart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private FormatInput formatInput;

    @Override
    public void addCart(Product toAddToCart) {
        productInCart.add( toAddToCart );
    }

    @Override
    public boolean removeFromCart(int productID) {
        for( Product currentProduct : productInCart ) {
            if (currentProduct.getID() == productID) {
                System.out.println("-----ITEM REMOVED-----");
                System.out.println( currentProduct );
                System.out.println("-----ITEM REMOVED END-----");
                return productInCart.remove(currentProduct);
            }
        }
        return false;
    }

    public int getCartTotal() {
        int totalPrice = 0;
        for(Product currentProduct : productInCart) {
            totalPrice += currentProduct.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<Product> getProduct() {
        return productInCart;
    }

    public int showCart() {
        System.out.println("\n------Cart------");
        String result = "";
        for(Product product : productInCart) {

            result = result + product.toString() + "\n";
        }
        result = result + "\nTotal: $" + this.getCartTotal();
        System.out.println(result);
        System.out.println("------End of Cart------");

        while(true) {
            System.out.println("\nReturn to main menu? (Yes) or Enter ProductID to remove from cart (ID)");
            String choice = sc.next();
            choice = formatInput.format(choice);
            if(choice.equals("Yes")) {
                return 0;
            } else {
                try {
                    int productID = Integer.parseInt(choice);
                    /*
                        TODO
                     can we catch the exception Integer.parseInt throws
                     or do you want me to throw a custom made exception AND catch it
                     throw Exception(e);
                    */

                    if( removeFromCart(productID) ) {

                    if (removeFromCart(productID)) {

                    }
                        return 1;
                    } else {
                        logger.warning("Could not find item with product id: " + productID);
                        System.out.println("Please try again.");
                    }

                } catch (NumberFormatException e) {

                    logger.warning("Please try again with a valid input");
                } catch(Exception e) {

                }
            }
        }
    }


    public double checkOut(Cart cart, double payment) {
        double totalPrice = cart.getCartTotal();

        DiscountCalculator discountCalculator = (loyaltyPoints) -> {
            double total = cart.getCartTotal();
            double discount = (loyaltyPoints * 0.05) * total;
            return total - discount;
        };
        double finalPrice = discountCalculator.calculateDiscount( 1);
        System.out.println("Original Price: $" + totalPrice);
        System.out.println("Total After Discount: $" + finalPrice);

        while (true) {
            try {
                System.out.println("Enter payment amount: \n");
                payment = sc.nextDouble();
                if (payment < finalPrice) {
                    throw new InsufficientPaymentException("Error: Insufficient payment, please enter a valid payment \n"
                            + "Total Price: $" + finalPrice);
                }
                break;
            } catch (InsufficientPaymentException e) {
                System.out.println(e.getMessage());
            }
        }
        double change = payment - finalPrice;
        System.out.println("Thank you for your purchase!");
        System.out.println("Your change: $" + change + "\n\n");
        return 0;
    }
}
