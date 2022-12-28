package com.solvd.onlineshop.exceptions;

import java.io.OptionalDataException;

public class Exception2 extends Exception {
    public Exception2(String message) {
        OptionalDataException input = null;
        if (input.length > 1) {
            System.out.println("Please Input Valid Entry");
        }
    }
}
