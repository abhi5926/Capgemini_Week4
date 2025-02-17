package customexception;
import java.beans.Customizer;
import java.util.Scanner;

public class CustomExceptionHandling {
    public static void validateAge(int age) throws CustomException {
        if(age < 18){
            throw new CustomException("Age must be 18 or greater than 18 :");
        }
    }
    public static void main(String[] args) {
        // Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);
        try{
            int age;
            System.out.println("Please Enter Age :");
            age = sc.nextInt();

            validateAge(age);
        } catch(CustomException e){
            System.out.println("Caught Custom Exception "+e.getMessage());
        }
    }
}

