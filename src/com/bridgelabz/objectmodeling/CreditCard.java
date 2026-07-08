package com.bridgelabz.objectmodeling;

/*
 * Credit Card Payment Implementation.
 */

public class CreditCard implements Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Payment of ₹" + amount + " completed using Credit Card.");
	}
}