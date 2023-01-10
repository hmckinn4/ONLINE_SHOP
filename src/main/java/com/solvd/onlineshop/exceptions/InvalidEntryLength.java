package com.solvd.onlineshop.exceptions;

import java.io.OptionalDataException;

import static com.solvd.onlineshop.pages.Page.logger;

public class InvalidEntryLength extends Exception {
    public InvalidEntryLength(String message) {
        OptionalDataException input = null;
        if (input.length < 3) {
            logger.warning("Please Input Valid Entry");
        }
    }
}
