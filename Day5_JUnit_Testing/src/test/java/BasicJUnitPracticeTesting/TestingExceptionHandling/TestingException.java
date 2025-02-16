package BasicJUnitPracticeTesting.TestingExceptionHandling;

import BasicJUnitPractice.TestingExceptionHandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class TestingException {
    @Test
    public void testingException(){
        int a =10;
        int b = 5;
        // Creating class Object
        ExceptionHandling ob = new ExceptionHandling();

        // method calling
        ob.divide(a,b);
    }
}
