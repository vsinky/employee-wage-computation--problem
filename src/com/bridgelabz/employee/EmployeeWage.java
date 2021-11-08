package com.bridgelabz.employee;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		// variables
		int empHrs = 0;
		int empWage = 0;

		double randomNumber = Math.floor(Math.random() * 10) % 3;

		if (IS_FULL_TIME == randomNumber) {
			System.out.println("Employee is present");
			empHrs = 8;
		} else if (IS_PART_TIME == randomNumber) {
			System.out.println("Employee is present but part time");
			empHrs = 4;
		} else {
			System.out.println("Employee is absent");
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :  " + empWage);
	}
}
