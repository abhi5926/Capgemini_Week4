package AnnotationProblems.PracticeProblemsForCustomAnnotation.IntermediateLevel.CreateMaxLengthAnnotationForFieldValidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

// User class with a username field annotated with @MaxLength
public class User {

    @MaxLength(value = 10)
    private String username;

    // Constructor to validate the username length
    public User(String username) {
        // Validate the field using reflection
        Field[] fields = User.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                // Check if the username length exceeds the maximum allowed length
                if (field.getName().equals("username") && username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username length exceeds the maximum allowed length of " + maxLength.value());
                }
            }
        }
        this.username = username;
    }

    // Getter for the username
    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        // Test the User class
        try {
            User user1 = new User("JohnDoe123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user2 = new User("JohnDoe");
            System.out.println("User created with username: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}