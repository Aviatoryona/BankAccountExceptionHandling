package dev.yonathaniel;

public class Main {

    public static void main(String[] args) {

        //Test Bank account
        SavingsAccount account=new SavingsAccount("345678","Aviator",5600);
        try {
            account.deposit(6700);
            account.calculateInterest();
            account.withdraw(20800);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }finally {
            account.displayAccountInfo();
        }
    }
}
