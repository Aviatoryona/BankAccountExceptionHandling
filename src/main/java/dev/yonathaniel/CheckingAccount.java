package dev.yonathaniel;

public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }


    @Override
    public void calculateInterest() throws InsufficientBalanceException, NegativeBalanceException {
        double interest= ((0.75)*getBalance());
        setBalance(getBalance()+interest);
        super.calculateInterest();
        System.out.println("Added interest and updated Balance");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (getBalance()<500)
            throw new InsufficientBalanceException();
        super.withdraw(amount);
    }
}
