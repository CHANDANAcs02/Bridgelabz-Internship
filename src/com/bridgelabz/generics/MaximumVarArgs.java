package com.bridgelabz.generics;

import java.util.Arrays;

/*
 * UC5
 * Program to find the maximum value using
 * Generic Varargs and Sorting.
 */

public class MaximumVarArgs {

	// Generic method to print maximum value
	public static <T> void printMax(T maximum) {

		System.out.println("Maximum Value : " + maximum);
	}

	// Generic method using Varargs
	public static <T extends Comparable<T>> T testMaximum(T... values) {

		// Sort the array
		Arrays.sort(values);

		// Last element will be the maximum
		T maximum = values[values.length - 1];

		// Print maximum
		printMax(maximum);

		return maximum;
	}

	public static void main(String[] args) {

		// Integer Test Case
		testMaximum(10, 25, 45, 60, 35, 18);

		// Float Test Case
		testMaximum(15.5f, 22.6f, 10.2f, 55.8f, 42.3f);

		// String Test Case
		testMaximum("Apple", "Peach", "Banana", "Orange", "Mango");
	}
}