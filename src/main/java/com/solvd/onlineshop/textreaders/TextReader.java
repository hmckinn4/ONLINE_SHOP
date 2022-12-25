package com.solvd.onlineshop.textreaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    public static void main(String[] args) {
        String fileName = "FedExEarnings.txt"; // change this to the name of your file
        String word = "Recession"; // change this to the word you want to count
        String word2 = "Slowdown";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                // split the line into words
                String[] words = line.split("\\s+");
                // count the number of occurrences of the word
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Number of occurrences of '" + word + "': " + count +
                    "\n Number of occurrences of '" + word2 + "': " + count);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
