package org.week4.day3;

import java.io.*;
import java.nio.file.Files;

public class ImageByteArrayStream {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";
        String outputImagePath = "output.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = Files.readAllBytes(new File(inputImagePath).toPath());

            // Write byte array back to a new image file
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

                int data;
                while ((data = bais.read()) != -1) {
                    baos.write(data);
                }

                Files.write(new File(outputImagePath).toPath(), baos.toByteArray());
            }

            System.out.println("Image successfully converted to byte array and written back.");
        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }
}
