package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Product Prices
 * using Quick Sort.
 */

public class SortProductPrices {

	public static void quickSort(int[] prices, int low, int high) {

		if (low < high) {

			int pivot = partition(prices, low, high);

			quickSort(prices, low, pivot - 1);

			quickSort(prices, pivot + 1, high);
		}
	}

	private static int partition(int[] prices, int low, int high) {

		int pivot = prices[high];

		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (prices[j] < pivot) {

				i++;

				int temp = prices[i];
				prices[i] = prices[j];
				prices[j] = temp;
			}
		}

		int temp = prices[i + 1];
		prices[i + 1] = prices[high];
		prices[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int[] prices = {4500, 1200, 8999, 3500, 999};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(prices));

		quickSort(prices, 0, prices.length - 1);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(prices));
	}
}