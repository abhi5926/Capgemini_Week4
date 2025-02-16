package AdvancedJUnitPracticeTesting.BankingTransactionTesting;

import AdvancedJUnitPracticeProblems.TestingBankingTransactions.BankingTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.image.BandCombineOp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingBankingTransaction {
  private BankingTransaction ob;

    @BeforeEach
    public void setUp() {
        ob = new BankingTransaction(1000);
    }
    @Test
    public void testDeposit() {
        ob.deposit(500); // Deposit 500
        assertEquals(1500, ob.getBalance());
    }

    @Test
    public void testWithdraw() {
        ob.withdraw(300); // Withdraw 300
        assertEquals(700, ob.getBalance());
    }
}
