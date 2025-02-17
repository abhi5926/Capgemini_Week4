package uncheckedexceptiontesting;
import java.util.*;
import org.junit.jupiter.api.Test;
import uncheckedexception.HandleException;


public class UncheckedExceptionTesting {
    // Creating object of Scanner class
    Scanner sc = new Scanner(System.in);

    int a=10,b=20;

    @Test
    public void uncheckedExceptionTesting(){
        // Creating Object of HandleException class
        HandleException ob = new HandleException();
        // Calling Method
        ob.exceptionHandle(a,b);
    }
}
