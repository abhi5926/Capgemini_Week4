package multiplecatchblocktesting;

import multiplecatchblocks.HandleExceptions;
import org.junit.jupiter.api.Test;

public class MultipleCatchBlockTesting {
    @Test
    public void multipleCatchBlockTesting(){
        // Creating Object of class HandleExceptions
        HandleExceptions ob = new HandleExceptions();

        String[] numbers = {"1","2","3","4","5"};
        int index = 2;
        // Method calling
        ob. exceptionHandle(numbers,index);
    }
}
