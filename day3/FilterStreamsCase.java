package org.week4.day3;

import java.io.*;

public class FilterStreamsCase {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File converted successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
