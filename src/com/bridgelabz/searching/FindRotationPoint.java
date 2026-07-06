package com.bridgelabz.searching;

/*
 * Binary Search
 * Find rotation point in rotated sorted array.
 */

public class FindRotationPoint {

	public static int findRotationPoint(int[] array) {

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (array[mid] > array[right]) {

				left = mid + 1;
			}

			else {

				right = mid;
			}
		}

		return left;
	}

	public static void main(String[] args) {

		int[] array = {15,18,2,3,6,12};

		int index = findRotationPoint(array);

		System.out.println("Rotation Point Index : " + index);

		System.out.println("Smallest Element : " + array[index]);
	}
}