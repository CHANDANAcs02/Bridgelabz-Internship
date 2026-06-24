package com.bridgelabz.oops;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;

		final int EMP_RATE_PER_HOUR = 20;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HOURS = 100;

		int totalEmpHours = 0;
		int totalWorkingDays = 0;

		while (totalEmpHours <= MAX_WORKING_HOURS
				&& totalWorkingDays < MAX_WORKING_DAYS) {

			totalWorkingDays++;

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

			System.out.println("Day " + totalWorkingDays
					+ " Employee Hours = " + empHours);
		}

		int totalWage = totalEmpHours * EMP_RATE_PER_HOUR;

		System.out.println("Total Employee Wage = " + totalWage);
	}
}