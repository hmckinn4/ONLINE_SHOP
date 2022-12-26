package com.solvd.onlineshop.pages;

import com.solvd.onlineshop.interfaces.AddtoCart;
import com.solvd.onlineshop.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart implements AddtoCart {
    public ArrayList<Product> productInCart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addCart(Product toAddToCart) {
        productInCart.add( toAddToCart );
    }

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

    public int showPage() {
        System.out.println("\n------Cart------");
        String result = "";
        for(Product product : productInCart) {
<<<<<<< HEAD
            result = result + product.toString() + "\n";
=======
            result = result + product.toString() + "\n\n";
>>>>>>> b57b92c (Initial commit)
        }
        result = result + "\nTotal: $" + this.getCartTotal();
        System.out.println(result);
        System.out.println("------End of Cart------");

        while(true) {
            System.out.println("\nContinue Shopping? (Yes) or Enter ProductID to remove from cart (ID)");
            String choice = sc.next();
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
<<<<<<< HEAD
                    if( removeFromCart(productID) ) {
=======
                    if (removeFromCart(productID)) {
>>>>>>> b57b92c (Initial commit)
                        return 1;
                    } else {
                        System.out.println("Could not find item with product id: " + productID);
                        System.out.println("Please try again.");
                    }
<<<<<<< HEAD
                }catch(Exception e) {
=======
                } catch (NumberFormatException e) {
>>>>>>> b57b92c (Initial commit)
                    System.out.println("Please try again with a valid input");
                }


            }
        }
        //TODO handle more input exceptions
    }

    @Override
    public void addCart() {
        System.out.println("Item added!!");
    }
}
