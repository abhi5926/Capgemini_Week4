package banktransactionsystemtesting;

import banktransactionsystem.BankAccount;
import banktransactionsystem.InsufficientBalanceException;
import org.junit.jupiter.api.Test;

public class BankTransactionSystemTesting {
    @Test
    public void bankTarnsactionSystemTesting(){
        // Creating class object
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

