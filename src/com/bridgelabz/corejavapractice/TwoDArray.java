package com.bridgelabz.corejavapractice;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		System.out.print("Enter number of rows: ");
		int m = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int n = sc.nextInt();

		int arr[][] = new int[m][n];

		System.out.println("Enter elements:");

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		pw.println("2D Array:");

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				pw.print(arr[i][j] + " ");
			}
			pw.println();
		}

		pw.flush();
	}
}