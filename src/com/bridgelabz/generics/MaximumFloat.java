package com.bridgelabz.generics;

/*
 * UC2
 * Program to find the maximum of three Float values
 * using compareTo() method.
 */

public class MaximumFloat {

	// Method to return the maximum of three Float values
	public static Float testMaximum(Float firstNumber,
			Float secondNumber, Float thirdNumber) {

		// Check if first number is the greatest
		if (firstNumber.compareTo(secondNumber) > 0 &&
				firstNumber.compareTo(thirdNumber) > 0) {

			return firstNumber;
		}

		// Check if second number is the greatest
		else if (secondNumber.compareTo(firstNumber) > 0 &&
				secondNumber.compareTo(thirdNumber) > 0) {

			return secondNumber;
		}

		// Otherwise third number is the greatest
		else {

			return thirdNumber;
		}
	}

	public static void main(String[] args) {

		// Test Case 2.1 - Maximum at First Position
		System.out.println("Maximum Float : "
				+ testMaximum(35.6f, 20.4f, 15.2f));

		// Test Case 2.2 - Maximum at Second Position
		System.out.println("Maximum Float : "
				+ testMaximum(12.5f, 55.8f, 30.1f));

		// Test Case 2.3 - Maximum at Third Position
		System.out.println("Maximum Float : "
				+ testMaximum(10.2f, 22.4f, 60.9f));
	}
}