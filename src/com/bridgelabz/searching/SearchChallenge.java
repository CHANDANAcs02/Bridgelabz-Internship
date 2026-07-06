package com.bridgelabz.searching;

import java.util.Arrays;

/*
 * Challenge Problem
 * Linear Search + Binary Search.
 */

public class SearchChallenge {

	public static void main(String[] args) {

		int[] numbers = {3,4,-1,1,7};

		Arrays.sort(numbers);

		System.out.println(Arrays.toString(numbers));

		int target = 4;

		int left = 0;

		int right = numbers.length-1;

		while(left<=right){

			int mid = left+(right-left)/2;

			if(numbers[mid]==target){

				System.out.println("Target Found At Index : "+mid);

				return;
			}

			if(numbers[mid]<target){

				left=mid+1;
			}

			else{

				right=mid-1;
			}
		}

		System.out.println("Target Not Found");
	}
}