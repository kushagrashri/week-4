package org.week4.day4;

import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept array size and elements
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            Integer[] array = new Integer[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Accept index number
            System.out.print("Enter index: ");
            int index = scanner.nextInt();

            // Retrieve and print the value at the index
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

