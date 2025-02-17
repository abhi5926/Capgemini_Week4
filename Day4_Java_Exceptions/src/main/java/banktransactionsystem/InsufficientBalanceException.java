package banktransactionsystem;

// Creating Custom Exception for insufficient balance
public class InsufficientBalanceException extends Exception {
    // Creating Constructor
    public InsufficientBalanceException(String message){
        super(message);
    }
}
