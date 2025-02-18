package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.01);
    }
}