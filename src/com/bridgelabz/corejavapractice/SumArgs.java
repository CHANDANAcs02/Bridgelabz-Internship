package com.bridgelabz.corejavapractice;

public class SumArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int sum = 0;
		        int invalidCount = 0;

		        for (int i = 0; i < args.length; i++) {

		            try {
		                int num = Integer.parseInt(args[i]);
		                sum = sum + num;
		            }
		            catch (NumberFormatException e) {
		                invalidCount++;
		            }
		        }

		        System.out.println("Sum = " + sum);
		        System.out.println("Invalid count = " + invalidCount);
		    }
		

	}


