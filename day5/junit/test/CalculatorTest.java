package src.main.java.org.week4.day5.junit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import src.main.java.org.week4.day5.junit.main.Calculator;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(-5, calculator.add(-10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-15, calculator.subtract(-10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(-50, calculator.multiply(-10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.0001);
        assertEquals(-2.0, calculator.divide(-10, 5), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}