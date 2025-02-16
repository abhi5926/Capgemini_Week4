package BasicJUnitPractice.TestingACalculator;

public class Calculator {
    // Method to add numbers
    public  int add(int a,int b){
        return a+b;
    }
    // Method to subtract numbers
    public int subtract(int a,int b){
        return a-b;
    }
    // method to multiply two numbers
    public int multiply(int a,int b){
        int result= a*b;
        return result;
    }
    // method to divide two numbers
    public int divide(int a,int b){
        int result= 0;
        try{
            result = a / b;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception "+e.getMessage());
        }
        return result;
    }
    public static void main(String[] args) {
        int a =10;
        int b = 5;
       // Creating class Object
        Calculator ob = new Calculator();
        System.out.println("Addition of two numbers :"+ob.add(a,b));
        System.out.println("Subtraction of two numbers :"+ob.subtract(a,b));
        System.out.println("Multiplication of two numbers :"+ob.multiply(a,b));
        System.out.println("Division of two numbers :"+ob.divide(a,b));
    }
}
