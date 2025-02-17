package throwvsthrowtesting;

import org.junit.jupiter.api.Test;
import throwvsthrows.ExceptionHierarchy;


public class ThrowVsThrowsTesting {
    @Test
    public void throwVsThrowsTesting(){
        double amount = 12000;
        double rate = 2;
        int years = 1;
        // Creating Object of class
        ExceptionHierarchy ob = new ExceptionHierarchy();

        // Method calling
        ob.variableCheck(amount, rate,years);
        // Method calling
        ob.calculateInterest(amount, rate, years);
    }
}
