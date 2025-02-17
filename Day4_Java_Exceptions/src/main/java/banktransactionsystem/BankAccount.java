package banktransactionsystem;

import java.util.InputMismatchException;

public class BankAccount {
    private double balance;

    // Creating Constructor
    public BankAccount(double balance){
        if(balance >= 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0){
            throw new InsufficientBalanceException("Invalid amount ");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance ");
        }
        balance -= amount;

        // Display balance
        System.out.println("Withdrawl Successful "+balance);
    }
    // Method to check Balance
    public double getBalance(){
        return balance;
    }
}
