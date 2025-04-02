package com.cmcglobal.baitap5;

public class CurrentAccount extends BankAccount implements Transaction {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }


    @Override
    public void withdraw(double amount) {
        // Allow overdraft of up to 500
        if (amount > balance + 500) {
            System.out.println("Overdraft limit exceeded. Withdrawal denied.");
        } else {
            balance = balance + amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }


    public void deposit(double amount, String currency) {
        // Assume simple currency conversion rate (1 USD = 0.9 EUR)
        double conversionRate = 0.9;
        if (currency.equalsIgnoreCase("EUR")) {
            amount = amount * conversionRate;
        }
        balance += amount;
        System.out.println("Deposited " + amount + " " + currency + ". New balance: " + balance);
    }
}