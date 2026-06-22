package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class SumOfThreeIntegers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		int count = 0;

		System.out.println("Triplets are:");

		for (int i = 0; i < n - 2; i++) {

			for (int j = i + 1; j < n - 1; j++) {

				for (int k = j + 1; k < n; k++) {

					if (arr[i] + arr[j] + arr[k] == 0) {

						count++;

						System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
					}
				}
			}
		}

		System.out.println("Number of Triplets = " + count);
	}
}