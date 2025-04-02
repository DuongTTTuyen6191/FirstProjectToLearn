package com.cmcglobal.baitap5;

public class SavingsAccount extends BankAccount implements Transaction {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Overridden withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    // Overloaded deposit method for SavingsAccount (without currency)
    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void deposit(double amount, String currency) {

        if (currency.equalsIgnoreCase("EUR")) {
            amount = amount * 0.9;
        } else if (currency.equalsIgnoreCase("VND")) {
            amount = amount/25000;
        }
        balance = balance + amount;
        System.out.println("Deposited " + amount + " " + currency + ". New balance: " + balance);
    }

}
