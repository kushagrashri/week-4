package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})  // Passing multiple test values
    void testIsEven(int number) {
        boolean expected = (number % 2 == 0); // Expected result
        assertEquals(expected, NumberUtils.isEven(number), "Test failed for number: " + number);
    }
}