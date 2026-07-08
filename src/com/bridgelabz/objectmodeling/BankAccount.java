package com.bridgelabz.objectmodeling;

/*
 * Bank Account class demonstrating
 * Encapsulation.
 */

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	// Parameterized Constructor
	public BankAccount(String accountNumber, String accountHolderName, double balance) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	// Deposit money
	public void deposit(double amount) {

		if (amount > 0) {

			balance += amount;

			System.out.println("₹" + amount + " deposited successfully.");
		}

		else {

			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw money
	public void withdraw(double amount) {

		if (amount <= 0) {

			System.out.println("Invalid withdrawal amount.");
		}

		else if (amount > balance) {

			System.out.println("Insufficient balance.");
		}

		else {

			balance -= amount;

			System.out.println("₹" + amount + " withdrawn successfully.");
		}
	}

	// Display account details
	public void displayAccountDetails() {

		System.out.println("\nAccount Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Available Balance : ₹" + balance);
	}
}