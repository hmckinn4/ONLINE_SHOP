package com.solvd.onlineshop.textreaders;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        // Create a map to store the word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Read the file
        try {
            String text = FileUtils.readFileToString(new File("FedExEarnings.txt"), "UTF-8");
            String[] lines = StringUtils.split(text, System.lineSeparator());
            for (String line : lines) {
                // Split the line into words
                String[] words = StringUtils.split(line);
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
