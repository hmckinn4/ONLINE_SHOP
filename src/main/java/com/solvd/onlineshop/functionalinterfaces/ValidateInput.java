package com.solvd.onlineshop.functionalinterfaces;

import java.util.Scanner;

@FunctionalInterface
public interface ValidateInput {
    boolean isValid(Scanner input);
}
