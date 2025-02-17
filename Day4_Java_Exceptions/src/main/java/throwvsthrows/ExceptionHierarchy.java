package throwvsthrows;

public class ExceptionHierarchy {
    // Creating Method calculateInterest
    public static void calculateInterest(double amount, double rate, int years) {
        double result = (amount * rate * years) / 100;
        System.out.println(result);
    }

    // Creating Validate Method
    public static void variableCheck(double amount,double rate,int years) throws IllegalArgumentException{
        if(amount < 0 || rate < 0 ){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
    }
    // Main Method
    public static void main(String[] args) {
        // Creating variables
        double amount = -12000;
        double rate = 3;
        int years = 1;

            // Method calling
            variableCheck(amount, rate,years);
            // Method calling
            calculateInterest(amount, rate, years);
        }
    }

