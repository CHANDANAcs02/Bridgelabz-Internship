package com.bridgelabz.objectmodeling;

/*
 * Driver class.
 */

public class PaymentApplication {

	public static void main(String[] args) {

		Checkout checkout = new Checkout();

		checkout.processPayment(new UPI(), 1500);

		checkout.processPayment(new CreditCard(), 2500);

		checkout.processPayment(new DebitCard(), 1800);

		checkout.processPayment(new NetBanking(), 5000);
	}
}