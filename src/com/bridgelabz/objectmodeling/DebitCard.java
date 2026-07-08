package com.bridgelabz.objectmodeling;

/*
 * Debit Card Payment Implementation.
 */

public class DebitCard implements Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Payment of ₹" + amount + " completed using Debit Card.");
	}
}