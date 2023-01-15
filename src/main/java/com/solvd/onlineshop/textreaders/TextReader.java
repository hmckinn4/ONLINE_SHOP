package com.solvd.onlineshop.textreaders;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {
    public static void main(String[] args) {
        String fileName = "FedExEarnings.txt"; // change this to the name of your file
        String word = "Recession"; // change this to the word you want to count
        String word2 = "Slowdown";
        Path path = Paths.get(fileName);

        try {
            List<String> lines = FileUtils.readLines(path.toFile(), StandardCharsets.UTF_8);
            int count = 0;
            for (String line : lines) {
                count += StringUtils.countMatches(line, word);
            }
            System.out.println("Number of occurrences of '" + word + "': " + count);
            count = 0;
            for (String line : lines) {
                count += StringUtils.countMatches(line, word2);
            }
            System.out.println("Number of occurrences of '" + word2 + "': " + count);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
