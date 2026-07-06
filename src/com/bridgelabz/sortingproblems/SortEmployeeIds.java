package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Employee IDs
 * using Insertion Sort.
 */
public class SortEmployeeIds {

	public static void insertionSort(int[] employeeIds) {

		for (int i = 1; i < employeeIds.length; i++) {

			int key = employeeIds[i];

			int j = i - 1;

			while (j >= 0 && employeeIds[j] > key) {

				employeeIds[j + 1] = employeeIds[j];

				j--;
			}

			employeeIds[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] employeeIds = {105, 101, 109, 102, 107};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(employeeIds));

		insertionSort(employeeIds);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(employeeIds));
	}
}