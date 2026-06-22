package com.bridgelabz.corejavapractice;

public class OddPositionElements {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};

		System.out.println("Elements on Odd Position:");

		for(int i = 1; i < arr.length; i += 2) {

			System.out.print(arr[i] + " ");
		}
	}
}