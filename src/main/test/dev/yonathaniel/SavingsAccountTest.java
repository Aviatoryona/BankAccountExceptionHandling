package dev.yonathaniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavingsAccountTest {

    private SavingsAccount savingsAccount;

    @Before
    public void setUp() throws Exception {
        savingsAccount=new SavingsAccount("34567890","SavingAccountTest",7800);
    }

    @Test
    public void setBalance() throws InsufficientBalanceException, NegativeBalanceException {
        savingsAccount.setBalance(3000);
        assertEquals(3000,savingsAccount.getBalance(),0);
    }

    @Test
    public void calculateInterest() throws InsufficientBalanceException, NegativeBalanceException {
        double interest=((0.05)*7800);
        savingsAccount.calculateInterest();
        assertEquals((7800+interest),savingsAccount.getBalance(),0);
    }

    @Test
    public void withdraw() throws InsufficientBalanceException {
        savingsAccount.withdraw(4500);
        assertEquals(3300,savingsAccount.getBalance(),0);
    }
}