package com.bridgelabz.objectmodeling;

/*
 * UPI Payment Implementation.
 */

public class UPI implements Payment {

	@Override
	public void makePayment(double amount) {

		System.out.println("Payment of ₹" + amount + " completed using UPI.");
	}
}