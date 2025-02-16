package ReflectionProblems.IntermediateLevel.DynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperation {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public void dynamicMethodInvocation(String operation, int num1, int num2) {
        try {
            // Create an instance of the MathOperation class
            Class<?> mathClass = Class.forName("ReflectionProblems.IntermediateLevel.DynamicMethodInvocation.MathOperation");
            Object mathObject = mathClass.getDeclaredConstructor().newInstance();

            // Get the method corresponding to the user's input
            Method method = mathClass.getMethod(operation, int.class, int.class);

            // Invoke the method with the user-provided numbers
            int result = (int) method.invoke(mathObject, num1, num2);

            // Display the result
            System.out.println("The result of the operation is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred. Please ensure the operation is valid.");
        }
    }

    public static void main(String[] args) {
        // Create Scanner class object
        Scanner sc = new Scanner(System.in);

        // Ask the user for the operation they want to perform
        System.out.println("Enter the operation (add, subtract, multiply): ");
        String operation = sc.nextLine();

        // Ask the user for two numbers
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        // Create the class object
        DynamicMethodInvocation ob = new DynamicMethodInvocation();

        // Call the method to perform dynamic method invocation
        ob.dynamicMethodInvocation(operation, num1, num2);

    }
}
