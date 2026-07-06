package com.bridgelabz.sortingproblems;

import java.util.Arrays;

/*
 * Sort Exam Scores
 * using Selection Sort.
 */
public class SortExamScores {

	public static void selectionSort(int[] scores) {

		for (int i = 0; i < scores.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < scores.length; j++) {

				if (scores[j] < scores[minIndex]) {

					minIndex = j;
				}
			}

			int temp = scores[minIndex];
			scores[minIndex] = scores[i];
			scores[i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] scores = {76, 98, 65, 88, 91};

		System.out.println(Arrays.toString(scores));

		selectionSort(scores);

		System.out.println(Arrays.toString(scores));
	}
}