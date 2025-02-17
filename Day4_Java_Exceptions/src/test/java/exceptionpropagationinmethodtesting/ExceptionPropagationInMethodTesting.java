package exceptionpropagationinmethodtesting;

import exceptionpropagationinmethods.ExceptionPropagation;
import org.junit.jupiter.api.Test;

public class ExceptionPropagationInMethodTesting {
    @Test
    public void exceptionPropagationInMethodTesting(){
        // Creating Object of the class
        ExceptionPropagation ob = new ExceptionPropagation();

        // Declearing Variables
        int a =20;
        int b = 10;
        // Method calling
        ob.method2(a,b);
    }
}
