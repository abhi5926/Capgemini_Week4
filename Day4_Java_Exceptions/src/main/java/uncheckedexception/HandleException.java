package uncheckedexception;
import java.util.*;

public class HandleException {
 // Method to handle exceptions
    public static void exceptionHandle(int a,int b){
        try{
            Integer result = a / b; // it can throw ArithmeticException
            System.out.println(result);
        }
        // Handling ArithmeticException
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught :"+e.getMessage());
        }
        // Handling InputMismatchException
        catch(InputMismatchException f){
            System.out.println("InputMismatchException caught :"+f.getMessage());
        }
    }
    public static void main(String[] args) {

        // Creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // enter first numbers
        try {
            int a;
            System.out.println("Enter first number :");
            a = sc.nextInt();

            // Enter Second number
            System.out.println("Enter first number :");
            int b = sc.nextInt();

            // Calling Method
            exceptionHandle(a,b);
        }
        // Handling InputMismatchException
        catch(InputMismatchException f){
            System.out.println("InputMismatchException caught :"+f.getMessage());
        }
    }
}
