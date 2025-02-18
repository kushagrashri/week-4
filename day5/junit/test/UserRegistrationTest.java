package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully",
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "john.doe@example.com", "Password1"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "pass"));
        assertEquals("Password must be at least 8 characters, contain one uppercase letter, and one digit", exception.getMessage());
    }
}