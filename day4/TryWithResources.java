package org.week4.day4;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line of the file
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            // Handle IO exceptions
            System.out.println("Error reading file");
        }
    }
}

