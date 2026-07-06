package com.bridgelabz.sorting;

import java.util.Arrays;

/*
 * Insertion Sort
 * Inserts every element into
 * its correct sorted position.
 */

public class InsertionSort {

	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			int key = array[i];

			int j = i - 1;

			while (j >= 0 && array[j] > key) {

				array[j + 1] = array[j];

				j--;
			}

			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] array = {5, 3, 8, 4, 2};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(array));

		insertionSort(array);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(array));
	}
}