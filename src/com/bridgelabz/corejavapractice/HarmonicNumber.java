package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		double harmonic = 0;

		for (int i = 1; i <= n; i++) {

			harmonic += (double) 1 / i;
		}

		System.out.println("Harmonic Value = " + harmonic);
	}
}