package finallyblockexecution;

public class FinallyBlockException {
    // Method to handle Exception
    public static void finallyBlockException(int a,int b){
        try{
            int result = a / b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException Occured ");
        }finally{
            System.out.println("Operartion Completed ");
        }
    }
    // Main Method
    public static void main(String[] args) {
        // Creating Variable
        int a = 20;
        int b = 10;

        // Method calling
        finallyBlockException(a,b);
    }
}
