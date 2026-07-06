package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Student Marks
 * using Bubble Sort.
 */
public class SortStudentMarks {

	public static void bubbleSort(int[] marks) {

		for (int i = 0; i < marks.length - 1; i++) {

			boolean swapped = false;

			for (int j = 0; j < marks.length - i - 1; j++) {

				if (marks[j] > marks[j + 1]) {

					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

	public static void main(String[] args) {

		int[] marks = {78, 45, 90, 65, 55};

		System.out.println("Before Sorting");

		System.out.println(Arrays.toString(marks));

		bubbleSort(marks);

		System.out.println("After Sorting");

		System.out.println(Arrays.toString(marks));
	}
}