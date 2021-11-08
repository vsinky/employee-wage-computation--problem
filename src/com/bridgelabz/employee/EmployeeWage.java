package com.bridgelabz.employee;

public class EmployeeWage {
	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome Employee Wage Computation");
		// variables
		int empHrs = 0;
		int empWage = 0;

		double randomNumber = Math.floor(Math.random() * 10) % 3;
		switch ((int) randomNumber) {
		case IS_FULL_TIME:
			System.out.println("Employee is present");
			empHrs = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Employee is present but part time");
			empHrs = 4;
			break;
		default:
			System.out.println("Employee is absent");

		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :  " + empWage);
	}
}