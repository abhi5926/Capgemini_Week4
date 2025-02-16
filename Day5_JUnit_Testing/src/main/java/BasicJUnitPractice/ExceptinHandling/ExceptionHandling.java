package BasicJUnitPractice.TestingExceptionHandling;

public class ExceptionHandling {

        // Method to divide two numbers
        public static int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        }


    public static void main(String[] args) {
        // creating variable
        int a =10;
        int b=20;

        // Method calling
        System.out.println(divide(a,b));
    }
}
