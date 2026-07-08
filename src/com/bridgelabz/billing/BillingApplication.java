package com.bridgelabz.billing;

/*
 * Driver class to demonstrate
 * Method Overloading.
 */

public class BillingApplication {

	public static void main(String[] args) {

		BillingUtility billing = new BillingUtility();

		System.out.println("Total (2 Integers) : "
				+ billing.calculateTotal(200, 300));

		System.out.println("Total (3 Integers) : "
				+ billing.calculateTotal(100, 200, 300));

		System.out.println("Total (2 Decimals) : "
				+ billing.calculateTotal(250.50, 149.75));

		System.out.println("Total (Integer + Decimal) : "
				+ billing.calculateTotal(500, 299.99));
	}
}