package multiplecatchblocks;
import java.util.*;
public class HandleExceptions {
    public static void exceptionHandle(String[] numbers,int index){
        try{
            System.out.println("Value at index "+index+" is "+numbers[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index! :"+e.getMessage());
        }catch(NullPointerException ex){
            System.out.println("Array is not initialized! "+ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size of array
        int n;
        System.out.println("Please Enter the Size of Array :");
        n = sc.nextInt();
        String[] numbers = new String[n];
        int index ;

        // Taking element in array as input
        for(int i=0;i<n;i++){
            System.out.println("Enter array element :");
            String a = sc.next();
            numbers[i] = a;
        }

        // taking array index as input
        System.out.println("Enter array Index :");
        index = sc.nextInt();

        if(index == 0)
        {
            numbers = null;
        }
        // Method calling
        exceptionHandle(numbers,index);
    }
}
