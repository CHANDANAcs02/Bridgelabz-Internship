package com.bridgelabz.generics;

/*
 * UC1
 * Program to find the maximum of three Integer values
 * using compareTo() method.
 */

public class MaximumInteger {

	// Method to return maximum among three Integer objects
	public static Integer testMaximum(Integer firstNumber,
			Integer secondNumber, Integer thirdNumber) {

		// Check if first number is greater than both
		if (firstNumber.compareTo(secondNumber) > 0 &&
				firstNumber.compareTo(thirdNumber) > 0) {

			return firstNumber;
		}

		// Check if second number is greater than both
		else if (secondNumber.compareTo(firstNumber) > 0 &&
				secondNumber.compareTo(thirdNumber) > 0) {

			return secondNumber;
		}

		// Otherwise third number is maximum
		else {

			return thirdNumber;
		}
	}

	public static void main(String[] args) {

		// Test Case 1.1
		System.out.println("Maximum Number : "
				+ testMaximum(30, 20, 10));

		// Test Case 1.2
		System.out.println("Maximum Number : "
				+ testMaximum(10, 40, 20));

		// Test Case 1.3
		System.out.println("Maximum Number : "
				+ testMaximum(10, 20, 50));
	}
}