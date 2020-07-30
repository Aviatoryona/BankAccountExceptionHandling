package dev.yonathaniel;

public class SavingsAccount extends BankAccount {


    public SavingsAccount() {
    }

    public SavingsAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void setBalance(double balance) throws NegativeBalanceException, InsufficientBalanceException {
        if (balance<2500){
            throw new InsufficientBalanceException();
        }
        super.setBalance(balance);
    }

    @Override
    public void calculateInterest() throws InsufficientBalanceException, NegativeBalanceException {
        double interest= ((0.05)*getBalance());
        setBalance(getBalance()+interest);
        super.calculateInterest();
        System.out.println("Added interest and updated Balance");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (getBalance()<2500)
            throw new InsufficientBalanceException();
        super.withdraw(amount);
    }


}
