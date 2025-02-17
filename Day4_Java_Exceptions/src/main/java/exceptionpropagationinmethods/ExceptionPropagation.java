package exceptionpropagationinmethods;

public class ExceptionPropagation {
    // Creating first Method
    public static int  method1(int a,int b){
        int result = a / b;
        return result;
    }
    // Creating second Method
    public static int method2(int a,int b){
        // Calling Method1
       return  method1(a,b);
    }
    // Main Method
    public static void main(String[] args) {
        int a = 50;
        int b = 10;

        // Exception Handling In main Method
        try {

            // Calling Method
            System.out.println(method2(a, b));

        }catch(ArithmeticException e){
            System.out.println("Handled exception in main"+e.getMessage());
        }
    }
}
