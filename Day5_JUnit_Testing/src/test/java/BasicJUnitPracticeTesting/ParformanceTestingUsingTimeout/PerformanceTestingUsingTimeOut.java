package BasicJUnitPracticeTesting.ParformanceTestingUsingTimeout;
import BasicJUnitPractice.PerformanceTestingUsingTimeout.PerformanceTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.TimeUnit;

public class PerformanceTestingUsingTimeOut {

    PerformanceTesting ob = new PerformanceTesting();


    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void performanceTesting() {

        String result = ob.longRunningTask();

        assertEquals("Task Completed", result, "The task did not complete successfully");
    }
}
