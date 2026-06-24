package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int empRatePerHour = 20;
		int fullDayHours = 8;

		int isPresent = (int)(Math.random() * 2);

		if (isPresent == 1) {

			int dailyWage = empRatePerHour * fullDayHours;

			System.out.println("Employee is Present");
			System.out.println("Daily Wage = " + dailyWage);

		} else {

			System.out.println("Employee is Absent");
			System.out.println("Daily Wage = 0");
		}
	}
}