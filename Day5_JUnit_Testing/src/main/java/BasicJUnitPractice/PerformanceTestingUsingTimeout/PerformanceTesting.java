package BasicJUnitPractice.PerformanceTestingUsingTimeout;

public class PerformanceTesting {
        // Method that sleeps for 3 seconds before returning a result
        public String longRunningTask() {
            try {
                // Sleep for 3 seconds to simulate a long-running task
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Task Completed";
        }

        public static void main(String[] args) {
            PerformanceTesting ob = new PerformanceTesting();
            String result = ob.longRunningTask();
            System.out.println(result);
        }
    }


