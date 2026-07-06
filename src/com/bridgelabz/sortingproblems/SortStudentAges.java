package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Student Ages
 * using Counting Sort.
 */
public class SortStudentAges {

	public static void countingSort(int[] ages) {

		int max = 18;

		int[] count = new int[max + 1];

		for (int age : ages) {

			count[age]++;
		}

		int index = 0;

		for (int i = 0; i <= max; i++) {

			while (count[i] > 0) {

				ages[index++] = i;

				count[i]--;
			}
		}
	}

	public static void main(String[] args) {

		int[] ages = {15, 12, 18, 10, 14, 12, 16};

		System.out.println(Arrays.toString(ages));

		countingSort(ages);

		System.out.println(Arrays.toString(ages));
	}
}