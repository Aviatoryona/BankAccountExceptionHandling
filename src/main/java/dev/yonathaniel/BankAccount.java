package dev.yonathaniel;

import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private String name;
    protected double balance;
    private Date date;

    public BankAccount() {
        this.setDate(new Date());
    }

    public void displayAccountInfo(){
        System.out.println(this.toString());
    }

    private void showBalance(){
        System.out.println("Balance is: " + this.balance);
    }

    public void deposit(double amount) throws NegativeBalanceException, InsufficientBalanceException {
        this.setBalance(this.getBalance() + amount);
        this.showBalance();
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(balance < amount)
            throw  new InsufficientBalanceException();
        this.balance -= amount; // this is wrong
        this.showBalance();
    }

    public void calculateInterest() throws InsufficientBalanceException, NegativeBalanceException {
        System.out.println("This method will calculate Interest");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.setDate(new Date());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws NegativeBalanceException,InsufficientBalanceException {
        if(balance < 0)
            throw new NegativeBalanceException();
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
