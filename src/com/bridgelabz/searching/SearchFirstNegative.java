package com.bridgelabz.searching;

/*
 * Linear Search
 * Find the first negative number in an array.
 */

public class SearchFirstNegative {

	public static int findFirstNegative(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < 0) {

				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] numbers = {15, 24, 18, -5, 20, -10};

		int index = findFirstNegative(numbers);

		if (index != -1) {

			System.out.println("First Negative Number Index : " + index);
		}

		else {

			System.out.println("No Negative Number Found");
		}
	}
}