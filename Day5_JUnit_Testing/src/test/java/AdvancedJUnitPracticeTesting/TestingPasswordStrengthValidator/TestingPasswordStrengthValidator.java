package AdvancedJUnitPracticeTesting.TestingPasswordStrengthValidator;

import AdvancedJUnitPracticeProblems.TestingPasswordStreangthValidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class TestingPasswordStrengthValidator {
    PasswordValidator ob = new PasswordValidator();

    @Test
    public void passwordValidator(){
        ob.isValidPassword("Pass1234");
    }
}
