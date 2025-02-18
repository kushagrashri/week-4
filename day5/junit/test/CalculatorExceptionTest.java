package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.CalculatorException;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorExceptionTest {

    @Test
    public void testDivideValid() {
        assertEquals(5, CalculatorException.divide(10, 2));
        assertEquals(-3, CalculatorException.divide(-9, 3));
        assertEquals(0, CalculatorException.divide(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        CalculatorException.divide(10, 0); // Should throw ArithmeticException
    }
}