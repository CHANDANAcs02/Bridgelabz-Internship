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

		switch(empCheck) {

		case 1:
			empHours = 4;
			System.out.println("Employee is Part Time");
			break;

		case 2:
			empHours = 8;
			System.out.println("Employee is Full Time");
			break;

		default:
			empHours = 0;
			System.out.println("Employee is Absent");
		}

		int empWage = empHours * empRatePerHour;

		System.out.println("Daily Wage = " + empWage);
	}
}