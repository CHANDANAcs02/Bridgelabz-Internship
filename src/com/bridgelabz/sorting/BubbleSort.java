package com.bridgelabz.sorting;

import java.util.Arrays;

/*
 * Bubble Sort
 * Repeatedly compares adjacent elements
 * and swaps them if they are in wrong order.
 */

public class BubbleSort {

	public static void bubbleSort(int[] array) {

		int size = array.length;
		boolean swapped;

		for (int i = 0; i < size - 1; i++) {

			swapped = false;

			for (int j = 0; j < size - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {

				break;
			}
		}
	}

	public static void main(String[] args) {

		int[] array = {5, 3, 8, 4, 2};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(array));

		bubbleSort(array);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(array));
	}
}