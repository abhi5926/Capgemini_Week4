package ReflectionProblems.BasicLevel.InvokePrivateMethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

    // Method to invoke the private multiply method
    public static  void invokePrivateMethod(int a, int b) {
        try {
            // Create an instance of the Calculator class
            Calculator calculator = new Calculator();

            // Get the Class object of the Calculator class
            Class<?> calculatorClass = calculator.getClass();

            // Access the private multiply method
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            // Set the private method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the private method with parameters a and b
            int result = (int) multiplyMethod.invoke(calculator, a, b);

            // Print the result
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create an instance of InvokePrivateMethod
        int a = 5, b = 6;

        // Call the method to invoke the private multiply method
        invokePrivateMethod(a, b);
    }
}
