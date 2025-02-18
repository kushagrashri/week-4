package src.main.java.org.week4.day5.junit.main;

public class NumberUtils {
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Example usage
        int testNumber = 10;
        System.out.println("Is " + testNumber + " even? " + isEven(testNumber));
    }
}