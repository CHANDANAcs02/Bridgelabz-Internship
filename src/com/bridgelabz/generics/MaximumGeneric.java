package com.bridgelabz.generics;

/*
 * UC4
 * Program to find the maximum of three values
 * using a Generic Method.
 */

public class MaximumGeneric {

	// Generic method to find maximum
	public static <T extends Comparable<T>> T testMaximum(T firstValue,
			T secondValue, T thirdValue) {

		// Check if first value is maximum
		if (firstValue.compareTo(secondValue) > 0 &&
				firstValue.compareTo(thirdValue) > 0) {

			return firstValue;
		}

		// Check if second value is maximum
		else if (secondValue.compareTo(firstValue) > 0 &&
				secondValue.compareTo(thirdValue) > 0) {

			return secondValue;
		}

		// Otherwise third value is maximum
		else {

			return thirdValue;
		}
	}

	public static void main(String[] args) {

		// Integer Test Case
		System.out.println("Maximum Integer : "
				+ testMaximum(20, 40, 10));

		// Float Test Case
		System.out.println("Maximum Float : "
				+ testMaximum(25.5f, 15.4f, 35.7f));

		// String Test Case
		System.out.println("Maximum String : "
				+ testMaximum("Apple", "Peach", "Banana"));
	}
}