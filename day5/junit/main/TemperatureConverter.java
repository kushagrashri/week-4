package src.main.java.org.week4.day5.junit.main;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("100°C to Fahrenheit: " + celsiusToFahrenheit(100)); // Expected: 212.0
        System.out.println("32°F to Celsius: " + fahrenheitToCelsius(32));     // Expected: 0.0
    }
}