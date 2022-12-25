//package com.solvd.onlineshop.pages;
//
//import com.solvd.onlineshop.models.Products;
//
//import java.util.Scanner;
//
//public class CartPage extends Page{
//    @Override
//    public int showPage() {
//        String result = "";
////        for(Products products : productsInCart) {
//            result = result + products.toString() + "\n";
//        }
//        result = result + "Total: $" + this.getCartTotal();
//        System.out.println(result);
//        System.out.println("What would you like to do? \n" +
//                "Continue Shopping? (Yes) \n" +
//                "Remove an item from cart");
//        String choice = sc.next();
//        if(choice.equals("Yes")) {
//            return 0;
//        }
//        return 4;
////        else-if(choice.equals("No")) {
////            System.out.println("Enter 2 to continue shopping for clothes, else enter 1 to go home")
////            ;
////        }
//        //TODO handle more input exceptions
//    }
//
//    @Override
//    public int showPage(Scanner sc) {
//        return 0;
//    }
//}
