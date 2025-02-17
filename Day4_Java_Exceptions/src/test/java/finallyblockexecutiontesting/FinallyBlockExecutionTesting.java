package finallyblockexecutiontesting;

import finallyblockexecution.FinallyBlockException;
import org.junit.jupiter.api.Test;

public class FinallyBlockExecutionTesting {
    @Test
    public void finallyBlockExecutionTesting(){

        // Creating Object of the Class
        FinallyBlockException ob = new FinallyBlockException();

        // Creating Variable
        int a =10;
        int b =5;

        // Calling Method
        ob.finallyBlockException(a,b);
    }
}
