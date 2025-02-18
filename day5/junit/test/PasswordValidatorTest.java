package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.PasswordValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("Secure123"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValidPassword("secure123"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValidPassword("SecurePass"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Sec12"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null));
    }
}