package org.week4.day4;

import java.util.*;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept array size and elements
            System.out.print("Enter array size: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter index: ");
            int index = scanner.nextInt();

            try {
                int element = array[index];

                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}

