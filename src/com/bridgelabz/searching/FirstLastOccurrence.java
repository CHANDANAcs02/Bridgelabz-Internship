package com.bridgelabz.searching;

/*
 * Binary Search
 * Find first and last occurrence
 * of an element in a sorted array.
 */

public class FirstLastOccurrence {

	// Find first occurrence
	public static int findFirst(int[] array, int target) {

		int left = 0;
		int right = array.length - 1;
		int result = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (array[mid] == target) {

				result = mid;
				right = mid - 1;
			}

			else if (array[mid] < target) {

				left = mid + 1;
			}

			else {

				right = mid - 1;
			}
		}

		return result;
	}

	// Find last occurrence
	public static int findLast(int[] array, int target) {

		int left = 0;
		int right = array.length - 1;
		int result = -1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (array[mid] == target) {

				result = mid;
				left = mid + 1;
			}

			else if (array[mid] < target) {

				left = mid + 1;
			}

			else {

				right = mid - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] array = {2, 4, 4, 4, 5, 7, 9};

		int target = 4;

		int first = findFirst(array, target);

		int last = findLast(array, target);

		if (first == -1) {

			System.out.println("Element Not Found");
		}

		else {

			System.out.println("First Occurrence : " + first);

			System.out.println("Last Occurrence : " + last);
		}
	}
}