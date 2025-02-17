package banktransactionsystem;


public class BankTransactionSystem {
    public static void main(String[] args) {
    // Creating Object of BankAccount class
        BankAccount ob = new BankAccount(1000);

        try {

            ob.withdraw(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
