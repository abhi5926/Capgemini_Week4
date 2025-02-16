package AdvancedJUnitPracticeProblems.TestingPasswordStreangthValidator;
import java.util.regex.*;
import java.util.regex.Pattern;

public class PasswordValidator {
        // Method to check if the password is valid
        public boolean isValidPassword(String password) {
            // Check if the password has at least 8 characters
            if (password == null || password.length() < 8) {
                return false;
            }
            // Regex for at least one uppercase letter
            String uppercasePattern = ".*[A-Z].*";
            // Regex for at least one digit
            String digitPattern = ".*\\d.*";


            boolean hasUppercase = Pattern.matches(uppercasePattern, password);
            boolean hasDigit = Pattern.matches(digitPattern, password);

            return hasUppercase && hasDigit;
        }

        public static void main(String[] args) {
            PasswordValidator ob = new PasswordValidator();

            // Test example passwords
            System.out.println("Password 'Pass1234' is valid: " + ob.isValidPassword("Pass1234"));

        }
    }


