import java.lang.reflect.Method;

public class MethodExecutionTime {

    // Measure execution time for a method with given name and parameters
    public static void measureExecutionTime(String methodName, Object[] params) {
        try {
            // Get the MathOperation class
            Class<?> mathClass = Class.forName("ReflectionProblems.AdvancedLevel.MethodExecutionTiming.MathOperation");

            // Get the method to be invoked
            Method method;
            if (methodName.equals("add")) {
                method = mathClass.getMethod("add", int.class, int.class);
            } else if (methodName.equals("subtract")) {
                method = mathClass.getMethod("subtract", int.class, int.class);
            } else if (methodName.equals("multiply")) {
                method = mathClass.getMethod("multiply", int.class, int.class);
            } else {
                System.out.println("Invalid method name.");
                return; // Exit if method is not valid
            }

            // Create an instance of MathOperation
            Object mathObject = mathClass.getDeclaredConstructor().newInstance();

            // Measure the start time
            long startTime = System.nanoTime();

            // Invoke the method dynamically
            Object result = method.invoke(mathObject, params);

            // Measure the end time
            long endTime = System.nanoTime();

            // Calculate and display the execution time
            long executionTime = endTime - startTime;
            System.out.println("Method executed in: " + executionTime + " nanoseconds.");
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example usage: add two numbers
        measureExecutionTime("add", new Object[]{5, 3});

        // Example usage: subtract two numbers
        measureExecutionTime("subtract", new Object[]{5, 3});

        // Example usage: multiply two numbers
        measureExecutionTime("multiply", new Object[]{5, 3});
    }
}
