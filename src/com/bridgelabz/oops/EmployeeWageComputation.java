package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int empRatePerHour = 20;
		int empHours = 0;

		// 0 = Absent
		// 1 = Part Time
		// 2 = Full Time
		int empCheck = (int)(Math.random() * 3);

		if (empCheck == 1) {

			empHours = 4;
			System.out.println("Employee is Part Time");

		} else if (empCheck == 2) {

			empHours = 8;
			System.out.println("Employee is Full Time");

		} else {

			empHours = 0;
			System.out.println("Employee is Absent");
		}

		int empWage = empHours * empRatePerHour;

		System.out.println("Daily Wage = " + empWage);
	}
}