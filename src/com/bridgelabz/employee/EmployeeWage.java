package com.bridgelabz.employee;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		// variables
		int empHrs = 0;
		int empWage = 0;

		double randomNumber = Math.floor(Math.random() * 10) % 2;

		if (IS_FULL_TIME == randomNumber) {
			System.out.println("Employee is present");
			empHrs = 8;
		} else {
			System.out.println("Employee is absent");
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :  " + empWage);
	}
}
