package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Book Prices
 * using Merge Sort.
 */

public class SortBookPrices {

	public static void mergeSort(double[] prices, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(prices, left, mid);

			mergeSort(prices, mid + 1, right);

			merge(prices, left, mid, right);
		}
	}

	private static void merge(double[] prices, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		double[] leftArray = new double[n1];
		double[] rightArray = new double[n2];

		for (int i = 0; i < n1; i++) {

			leftArray[i] = prices[left + i];
		}

		for (int j = 0; j < n2; j++) {

			rightArray[j] = prices[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;

		while (i < n1 && j < n2) {

			if (leftArray[i] <= rightArray[j]) {

				prices[k++] = leftArray[i++];
			}

			else {

				prices[k++] = rightArray[j++];
			}
		}

		while (i < n1) {

			prices[k++] = leftArray[i++];
		}

		while (j < n2) {

			prices[k++] = rightArray[j++];
		}
	}

	public static void main(String[] args) {

		double[] prices = {499, 199, 999, 299, 150};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(prices));

		mergeSort(prices, 0, prices.length - 1);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(prices));
	}
}