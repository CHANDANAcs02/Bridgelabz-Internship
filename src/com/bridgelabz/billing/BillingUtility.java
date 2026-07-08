package com.bridgelabz.billing;

/*
 * Billing Utility class demonstrating
 * Method Overloading.
 */

public class BillingUtility {

	// Calculate total for two integer items
	public int calculateTotal(int item1, int item2) {

		return item1 + item2;
	}

	// Calculate total for three integer items
	public int calculateTotal(int item1, int item2, int item3) {

		return item1 + item2 + item3;
	}

	// Calculate total for two decimal items
	public double calculateTotal(double item1, double item2) {

		return item1 + item2;
	}

	// Calculate total for integer and decimal item
	public double calculateTotal(int item1, double item2) {

		return item1 + item2;
	}
}