package src.main.java.org.week4.day5.junit.main;

public class UserRegistration {

    // Registers a user with validation checks
    public static String registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters, contain one uppercase letter, and one digit");
        }
        return "User registered successfully";
    }

    public static void main(String[] args) {
        System.out.println(registerUser("JohnDoe", "john.doe@example.com", "Password1")); // Success
        // Uncomment to test exceptions
        // System.out.println(registerUser("", "john.doe@example.com", "Password1")); // Username error
        // System.out.println(registerUser("JohnDoe", "johndoe.com", "Password1")); // Email error
        // System.out.println(registerUser("JohnDoe", "john.doe@example.com", "pass")); // Password error
    }
}