package com.bridgelabz.oops;

public class EmployeeWageComputation {

	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;

	static final int EMP_RATE_PER_HOUR = 20;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HOURS = 100;

	// Method to calculate employee wage
	public static int computeEmployeeWage() {

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
		}

		return totalEmpHours * EMP_RATE_PER_HOUR;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int totalWage = computeEmployeeWage();

		System.out.println("Total Employee Wage = " + totalWage);
	}
}