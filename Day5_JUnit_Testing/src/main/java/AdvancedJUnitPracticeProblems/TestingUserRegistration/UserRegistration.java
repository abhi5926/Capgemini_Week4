package AdvancedJUnitPracticeProblems.TestingUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class UserRegistration {
        // Method to register a user
        public void registerUser(String username, String email, String password) {
            if (username == null || username.isEmpty() || !username.matches("^[a-zA-Z0-9_]+$")) {
                throw new IllegalArgumentException("Invalid username");
            }

            if (email == null || !isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format.");
            }

            if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
                throw new IllegalArgumentException("Invalid password.");
            }

            // Registration successful, you can proceed with saving user data
            System.out.println("User registered successfully.");
        }

        // Helper method to validate email format
        private boolean isValidEmail(String email) {
            String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        public static void main(String[] args) {
            UserRegistration userRegistration = new UserRegistration();

            // Test with valid inputs
            userRegistration.registerUser("Abhishek", "abhisheksen4567@gmail.com", "Password123");

        }
    }


