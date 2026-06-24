package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		// Generate random attendance
		// 0 = Absent, 1 = Present
		int isPresent = (int)(Math.random() * 2);

		if (isPresent == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}