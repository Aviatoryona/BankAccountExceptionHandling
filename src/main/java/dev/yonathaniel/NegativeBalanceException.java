package dev.yonathaniel;

class NegativeBalanceException extends Exception {
    NegativeBalanceException(){
        super("Negative balance not allowed");
    }
}
