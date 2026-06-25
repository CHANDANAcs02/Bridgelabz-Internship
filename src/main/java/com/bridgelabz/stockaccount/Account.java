package com.bridgelabz.stockaccount;

public class Account {

    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debit Successful");
        } else {
            System.out.println("Debit amount exceeded account balance");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}