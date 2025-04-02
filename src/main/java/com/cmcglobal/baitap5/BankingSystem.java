package com.cmcglobal.baitap5;

// Main class to test the Banking System
public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Alice", 1000);
        CurrentAccount currentAccount = new CurrentAccount("Bob", 2000);


        savingsAccount.displayBalance();
        currentAccount.displayBalance();


        savingsAccount.deposit(500);
        savingsAccount.deposit(300000000, "VND");

        currentAccount.deposit(1000);
        currentAccount.deposit(500, "EUR");


        savingsAccount.withdraw(200);
        currentAccount.withdraw(2500); // Test overdraft
    }
}

