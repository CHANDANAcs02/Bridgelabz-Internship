package com.bridgelabz.objectmodeling;

/*
 * Driver class for Bank Account.
 */

public class BankApplication {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(
				"ACC1001",
				"Chandana",
				10000);

		account.displayAccountDetails();

		account.deposit(2500);

		account.withdraw(4000);

		account.withdraw(12000);

		account.deposit(-500);

		account.displayAccountDetails();
	}
}