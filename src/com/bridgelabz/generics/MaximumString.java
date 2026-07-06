package com.bridgelabz.generics;

/*
 * UC3
 * Program to find the maximum of three String values
 * using compareTo() method.
 */

public class MaximumString {

	// Method to return the maximum of three String values
	public static String testMaximum(String firstString,
			String secondString, String thirdString) {

		// Check if first string is the greatest
		if (firstString.compareTo(secondString) > 0 &&
				firstString.compareTo(thirdString) > 0) {

			return firstString;
		}

		// Check if second string is the greatest
		else if (secondString.compareTo(firstString) > 0 &&
				secondString.compareTo(thirdString) > 0) {

			return secondString;
		}

		// Otherwise third string is the greatest
		else {

			return thirdString;
		}
	}

	public static void main(String[] args) {

		// Test Case 3.1 - Maximum at First Position
		System.out.println("Maximum String : "
				+ testMaximum("Peach", "Apple", "Banana"));

		// Test Case 3.2 - Maximum at Second Position
		System.out.println("Maximum String : "
				+ testMaximum("Apple", "Peach", "Banana"));

		// Test Case 3.3 - Maximum at Third Position
		System.out.println("Maximum String : "
				+ testMaximum("Apple", "Banana", "Peach"));
	}
}