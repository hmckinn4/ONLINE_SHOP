package com.solvd.onlineshop.textreaders;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {
    public static void main(String[] args) {
        String fileName = "src/main/FedExEarnings.txt"; // change this to the name of your file
        String word = "FedEx"; // change this to the word you want to count
        String word2 = "Slowdown";
        Path path = Paths.get(fileName);

        try {
            List<String> lines = FileUtils.readLines(path.toFile(), StandardCharsets.UTF_8);
            int count = 0;
            for (String line : lines) {
                count += StringUtils.countMatches(line, word);
            }

            int count2 = 0;
            for (String line : lines) {
                count2 += StringUtils.countMatches(line, word2);
            }

            String data = String.format("%s - %d\n%s - %d", word, count, word2, count2);
            File file = new File("output.txt");
            FileUtils.writeStringToFile(file, data, StandardCharsets.UTF_8);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}