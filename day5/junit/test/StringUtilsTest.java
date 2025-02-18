package src.main.java.org.week4.day5.junit.test;

import static org.junit.Assert.*;

import src.main.java.org.week4.day5.junit.main.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("racecar", stringUtils.reverse("racecar"));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("Madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals("TEST", stringUtils.toUpperCase("Test"));
    }
}