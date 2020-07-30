package dev.yonathaniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingAccountTest {

    private CheckingAccount account;
    @Before
    public void setUp() throws Exception {
        account=new CheckingAccount("567890","CheckingAccountTest",678);
    }


    @Test
    public void calculateInterest() throws InsufficientBalanceException, NegativeBalanceException {
        double interest=(0.75)*678;
        account.calculateInterest();
        assertEquals((678+interest),account.getBalance(),0);
    }

    @Test
    public void withdraw() throws InsufficientBalanceException {
        account.withdraw(450);
        assertEquals(228,account.getBalance(),0);
    }
}