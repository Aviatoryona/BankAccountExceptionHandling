package dev.yonathaniel;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}
