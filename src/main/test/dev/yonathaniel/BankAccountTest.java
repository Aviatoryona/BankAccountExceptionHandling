package dev.yonathaniel;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;

    @Before
    public void setUp() throws Exception {
        account = new BankAccount("4567890", "TestAccount", 8900);
    }

    @Ignore
    @Test
    public void displayAccountInfo() {
    }

    @Test
    public void deposit() throws InsufficientBalanceException, NegativeBalanceException {
        account.deposit(500);
        assertEquals(9400, account.getBalance(), 0);
    }

    @Test
    public void withdraw() throws InsufficientBalanceException {
        account.withdraw(200);
        assertEquals(8700, account.getBalance(), 0);
    }

    @Ignore
    @Test
    public void calculateInterest() {
    }

    @Test
    public void getAccountNumber() {
        assertEquals("4567890", account.getAccountNumber());
    }

    @Test
    public void setAccountNumber() {
        assertEquals("4567890", account.getAccountNumber());
    }

    @Test
    public void getName() {
        assertEquals("TestAccount", account.getName());
    }

    @Test
    public void setName() {
        assertEquals("TestAccount", account.getName());
    }

    @Test
    public void getBalance() {
        assert -1 != account.getBalance();
    }

    @Test
    public void setBalance() throws InsufficientBalanceException, NegativeBalanceException {
        account.setBalance(400);
        assert -1 != account.getBalance();
        assertEquals(400, account.getBalance(), 0);
    }

    @Test
    public void getDate() {
        assert null != account.getDate();
    }

    @Test
    public void setDate() {
        Date date = new Date();
        assert date.getTime() > account.getDate().getTime();
    }
}