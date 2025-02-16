package AdvancedJUnitPracticeProblems.TestingBankingTransactions;

public class BankingTransaction {
    private double balance;

    // Creating Constructor
    public BankingTransaction(double initialBalance) {
        this.balance = initialBalance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount. Either the amount is too large or negative.");
        }
    }
    // Method to get Balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankingTransaction ob = new BankingTransaction(500);

        System.out.println("Initial Balance: " + ob.getBalance());

        ob.deposit(500);  // Deposit 500
        System.out.println("After depositing 500: " + ob.getBalance());

        ob.withdraw(300);
        System.out.println("After withdrawing 300: " + ob.getBalance());
    }
}
