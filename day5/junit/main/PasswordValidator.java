package src.main.java.org.week4.day5.junit.main;

public class PasswordValidator {

    // Method to validate password strength
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Password123")); // true
        System.out.println(isValidPassword("password"));     // false
        System.out.println(isValidPassword("PASSWORD"));     // false
        System.out.println(isValidPassword("Pass12"));       // false
    }
}