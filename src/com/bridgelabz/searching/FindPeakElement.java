package com.bridgelabz.searching;

/*
 * Binary Search
 * Find Peak Element.
 */

public class FindPeakElement {

	public static int findPeak(int[] array) {

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (array[mid] < array[mid + 1]) {

				left = mid + 1;
			}

			else {

				right = mid;
			}
		}

		return left;
	}

	public static void main(String[] args) {

		int[] array = {1,3,20,4,1,0};

		int peak = findPeak(array);

		System.out.println("Peak Element : " + array[peak]);
	}
}