package AdvancedJUnitPracticeTesting.UserRegistrationTesting;

import AdvancedJUnitPracticeProblems.TestingUserRegistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTesting {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testUserRegistration(){
       userRegistration.registerUser("Abhishek", "abhisheksen4567@gmail.com", "Password123");
    }
}
