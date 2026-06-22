package com.bridgelabz.corejavapractice;

public class FrequencyOfElements {

	public static void main(String[] args) {

		int arr[] = {1,2,8,3,2,2,2,5,1};

		for(int i = 0; i < arr.length; i++) {

			int count = 1;
			boolean visited = false;

			for(int k = i - 1; k >= 0; k--) {
				if(arr[i] == arr[k]) {
					visited = true;
					break;
				}
			}

			if(visited)
				continue;

			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}

			System.out.println(arr[i] + " occurs " + count + " times");
		}
	}
}