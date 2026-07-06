package com.bridgelabz.sorting;

import java.util.Arrays;

/*
 * Merge Sort
 * Divide and Conquer algorithm.
 */

public class MergeSort {

	public static void mergeSort(int[] array, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(array, left, mid);

			mergeSort(array, mid + 1, right);

			merge(array, left, mid, right);
		}
	}

	private static void merge(int[] array, int left, int mid, int right) {

		int leftSize = mid - left + 1;
		int rightSize = right - mid;

		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];

		for (int i = 0; i < leftSize; i++) {

			leftArray[i] = array[left + i];
		}

		for (int j = 0; j < rightSize; j++) {

			rightArray[j] = array[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < leftSize && j < rightSize) {

			if (leftArray[i] <= rightArray[j]) {

				array[k++] = leftArray[i++];
			}

			else {

				array[k++] = rightArray[j++];
			}
		}

		while (i < leftSize) {

			array[k++] = leftArray[i++];
		}

		while (j < rightSize) {

			array[k++] = rightArray[j++];
		}
	}

	public static void main(String[] args) {

		int[] array = {5, 3, 8, 4, 2};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(array));

		mergeSort(array, 0, array.length - 1);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(array));
	}
}