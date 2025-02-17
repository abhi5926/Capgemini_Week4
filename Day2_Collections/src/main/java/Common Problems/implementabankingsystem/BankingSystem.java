package implementabankingsystem;
import java.util.*;
public class BankingSystem {

        // HashMap to store customer accounts (AccountNumber -> Balance)
        private Map<String, Double> accounts;

        // TreeMap to store customers sorted by their balance
        private Map<Double, Set<String>> sortedAccounts;

        // Queue to store withdrawal requests
        private Queue<WithdrawlRequest> withdrawalQueue;

        public BankingSystem() {
            accounts = new HashMap<>();
            sortedAccounts = new TreeMap<>();
            withdrawalQueue = new LinkedList<>();
        }

        // Method to add a new customer account
        public void createAccount(String accountNumber, double initialBalance) {
            accounts.put(accountNumber, initialBalance);

            // Add the account to sorted accounts
            sortedAccounts.computeIfAbsent(initialBalance, k -> new HashSet<>()).add(accountNumber);
        }

        // Method to deposit money to an account
        public void deposit(String accountNumber, double amount) {
            if (!accounts.containsKey(accountNumber)) {
                System.out.println("Account not found!");
                return;
            }

            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);

            // Update the sorted accounts
            sortedAccounts.get(accounts.get(accountNumber) - amount).remove(accountNumber);
            sortedAccounts.computeIfAbsent(newBalance, k -> new HashSet<>()).add(accountNumber);
        }

        // Method to withdraw money from an account
        public void withdraw(String accountNumber, double amount) {
            if (!accounts.containsKey(accountNumber)) {
                System.out.println("Account not found!");
                return;
            }

            double balance = accounts.get(accountNumber);
            if (balance < amount) {
                System.out.println("Insufficient funds in account " + accountNumber);
                return;
            }

            // Create a withdrawal request and add it to the queue
            withdrawalQueue.add(new WithdrawlRequest(accountNumber, amount));
        }

        // Process withdrawal requests
        public void processWithdrawals() {
            while (!withdrawalQueue.isEmpty()) {
                WithdrawlRequest request = withdrawalQueue.poll();
                String accountNumber = request.accountNumber;
                double amount = request.amount;

                double balance = accounts.get(accountNumber);
                double newBalance = balance - amount;

                // Update the account balance
                accounts.put(accountNumber, newBalance);

                // Update the sorted accounts
                sortedAccounts.get(balance).remove(accountNumber);
                sortedAccounts.computeIfAbsent(newBalance, k -> new HashSet<>()).add(accountNumber);

                System.out.println("Processed withdrawal of " + amount + " from account " + accountNumber);
            }
        }

        // Display account balance for a given account number
        public void displayAccountBalance(String accountNumber) {
            if (!accounts.containsKey(accountNumber)) {
                System.out.println("Account not found!");
                return;
            }

            System.out.println("Balance for account " + accountNumber + ": " + accounts.get(accountNumber));
        }

        // Display customers sorted by balance
        public void displayCustomersByBalance() {
            for (Map.Entry<Double, Set<String>> entry : sortedAccounts.entrySet()) {
                System.out.println("Balance: " + entry.getKey() + " - Accounts: " + entry.getValue());
            }
        }



        public static void main(String[] args) {
            BankingSystem bankSystem = new BankingSystem();

            // Create accounts
            bankSystem.createAccount("A101", 5000);
            bankSystem.createAccount("A102", 3000);
            bankSystem.createAccount("A103", 7000);

            // Display customers by balance
            System.out.println("Customers sorted by balance:");
            bankSystem.displayCustomersByBalance();

            // Deposit some money
            bankSystem.deposit("A101", 1500);

            // Display account balance
            bankSystem.displayAccountBalance("A101");

            // Withdraw some money (add to withdrawal queue)
            bankSystem.withdraw("A102", 500);

            // Process the withdrawal requests
            bankSystem.processWithdrawals();

            // Display customers by balance again
            System.out.println("Customers sorted by balance after withdrawal:");
            bankSystem.displayCustomersByBalance();
        }
    }


