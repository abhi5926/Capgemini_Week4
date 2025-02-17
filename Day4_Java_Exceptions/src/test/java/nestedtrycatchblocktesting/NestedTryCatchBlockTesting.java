package nestedtrycatchblocktesting;

import nestedtrycatchblock.HandlingException;
import org.junit.jupiter.api.Test;

public class NestedTryCatchBlockTesting {
    @Test
    public void nestedTryCatchBlockTesting(){
        // size of array
        int n = 5;

        // Divisor
        int divisor = 2;

        // Index
        int index = 2;
        // Creating Array
        int[] arr = new int[n];
        // Creating Object of the class
        HandlingException ob = new HandlingException();

        // Calling Method
        ob.nestedTryCatch(arr,divisor,index);

    }
}
