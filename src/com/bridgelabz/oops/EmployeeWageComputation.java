package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;

		int empRatePerHour = 20;
		int totalWorkingDays = 20;
		int totalEmpHours = 0;

		for (int day = 1; day <= totalWorkingDays; day++) {

			int empHours = 0;

			int empCheck = (int) (Math.random() * 3);

			switch (empCheck) {

			case IS_PART_TIME:
				empHours = 4;
				break;

			case IS_FULL_TIME:
				empHours = 8;
				break;

			default:
				empHours = 0;
			}

			totalEmpHours += empHours;
		}

		int monthlyWage = totalEmpHours * empRatePerHour;

		System.out.println("Monthly Employee Wage = " + monthlyWage);
	}
}