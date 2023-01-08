package com.solvd.onlineshop.exceptions;

import java.io.OptionalDataException;

import static com.solvd.onlineshop.pages.Page.logger;

public class InvalidEntry extends Exception {
    public InvalidEntry(String message) {
        OptionalDataException input = null;
        if (input.length > 1) {
            logger.warning("Please Input Valid Entry");
        }
    }
}
