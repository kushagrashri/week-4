package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("16-02-2024", DateFormatter.formatDate("2024-02-16"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertEquals("Invalid date format", DateFormatter.formatDate("2024/02/16")); // Wrong separator
        assertEquals("Invalid date format", DateFormatter.formatDate("16-02-2024")); // Already formatted
        assertEquals("Invalid date format", DateFormatter.formatDate("abcd-ef-gh")); // Non-numeric input
    }
}