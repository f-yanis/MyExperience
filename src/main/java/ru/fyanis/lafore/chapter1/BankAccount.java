package ru.fyanis.lafore.chapter1;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void diposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void display() {
        System.out.println("balance = " + balance);;
    }


}
