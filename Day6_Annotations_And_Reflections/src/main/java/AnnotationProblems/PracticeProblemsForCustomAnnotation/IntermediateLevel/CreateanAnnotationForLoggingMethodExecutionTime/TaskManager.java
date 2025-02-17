package AnnotationProblems.PracticeProblemsForCustomAnnotation.IntermediateLevel.CreateanAnnotationForLoggingMethodExecutionTime;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// TaskManager class with methods where we apply @LogExecutionTime
public class TaskManager {

    @LogExecutionTime
    public void taskOne() {

        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Task One completed.");
    }

    @LogExecutionTime
    public void taskTwo() {
        // Simulate a different task with a larger loop
        long sum = 0;
        for (int i = 0; i < 5000000; i++) {
            sum += i;
        }
        System.out.println("Task Two completed.");
    }

    // Method to measure the execution time of methods annotated with @LogExecutionTime
    public static void logExecutionTime(Object object) {
        // Get all methods of the object class
        Method[] methods = object.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    // Measure the time before and after executing the method
                    long startTime = System.nanoTime();
                    method.invoke(object);
                    long endTime = System.nanoTime();

                    // Calculate and print the execution time
                    long executionTime = endTime - startTime;
                    System.out.println("Execution time for method " + method.getName() + ": " + executionTime + " nanoseconds");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Log execution time for methods annotated with @LogExecutionTime
        logExecutionTime(manager);
    }
}