package com.bridgelabz.corejavapractice;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c)
			System.out.println(a + " is Largest");
		else if (b >= c)
			System.out.println(b + " is Largest");
		else
			System.out.println(c + " is Largest");
	}
}