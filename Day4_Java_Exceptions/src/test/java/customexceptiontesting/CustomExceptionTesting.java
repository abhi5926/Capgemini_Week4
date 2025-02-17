package customexceptiontesting;


import customexception.CustomException;
import customexception.CustomExceptionHandling;
import org.junit.jupiter.api.Test;

public class CustomExceptionTesting {

    @Test
    public void customExceptionTesting(){
        int age = 13;
        try {
            CustomExceptionHandling.validateAge(20); // Age 20 is valid
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception "+e.getMessage());
        }

    }
    }

