package com.bridgelabz.objectmodeling;

/*
 * Net Banking Payment Implementation.
 */

public class NetBanking implements Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Payment of ₹" + amount + " completed using Net Banking.");
	}
}