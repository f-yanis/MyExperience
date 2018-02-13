package ru.fyanis.lafore.chapter1;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(100);
        System.out.println("до транзакций");
        bank.display();

        bank.diposit(47.8);
        bank.withdraw(15.77);

        System.out.println("после транзакций");
        bank.display();
    }
}
