package implementabankingsystem;

public class WithdrawlRequest {
    String accountNumber;
    double amount;

    public WithdrawlRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
