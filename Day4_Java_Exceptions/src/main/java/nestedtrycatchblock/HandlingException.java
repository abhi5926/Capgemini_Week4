package nestedtrycatchblock;
import java.util.*;
import java.util.Scanner;

public class HandlingException {
    // Method to handle Exception
    public static void nestedTryCatch(int[] arr,int divisor,int index){
      try{
          // Handling ArrayIndexOutOfBound Exception
          try{
                 System.out.println(arr[index]);
          }catch(ArrayIndexOutOfBoundsException ar){
              System.out.println("Invalid array index! "+ar.getMessage());
          }

          // Handling ArithmeticException
          try{
              int result = arr[index] / divisor;
          }catch(ArithmeticException exep){
              System.out.println("Cannot divide by zero!" + exep.getMessage());
          }

      }catch(Exception e){
          System.out.println("Exception has Occured :"+e.getMessage());
      }
    }
    public static void main(String[] args) {
        // Creating Scanner class object
        Scanner sc = new Scanner(System.in);

        // Taking Array size as Input
        int n;
        System.out.println("Please Enter the Size of array :");
        n = sc.nextInt();

        // Creating Array of Size n and also taking element as input in array
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Element in array :");
            int a = sc.nextInt();
        }
        // Taking Divisor as input
        int divisor;
        System.out.println("Enter the Divisor element :");
        divisor = sc.nextInt();

        // Taking Index as input
        int index;
        System.out.println("Enter the Index :");
        index = sc.nextInt();
        // Method calling
        nestedTryCatch(arr,divisor,index);
    }
}
