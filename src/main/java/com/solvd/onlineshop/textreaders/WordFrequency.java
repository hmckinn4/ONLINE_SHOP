package com.solvd.onlineshop.textreaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        // Create a map to store the word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Read the file
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");
                // Iterate over the words
                for (String word : words) {
                    // Remove any punctuation from the word
                    word = word.replaceAll("[^a-zA-Z]", "");
                    // Convert the word to lowercase
                    word = word.toLowerCase();
                    // Increment the frequency of the word
                    int count = wordFrequency.getOrDefault(word, 0);
                    wordFrequency.put(word, count + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Create a list of the entries in the map
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordFrequency.entrySet());
        // Sort the entries by frequency in descending order
        Collections.sort(entries, (a, b) -> b.getValue() - a.getValue());

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}