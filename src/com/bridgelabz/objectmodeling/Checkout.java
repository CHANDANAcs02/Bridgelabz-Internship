package com.bridgelabz.objectmodeling;

/*
 * Checkout class.
 */

public class Checkout {

	public void processPayment(Payment payment, double amount) {

		payment.makePayment(amount);
	}
}