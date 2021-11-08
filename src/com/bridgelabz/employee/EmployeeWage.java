package com.bridgelabz.employee;

public class EmployeeWage {
	// static =class level var = scope within class but based on modifier
	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome Employee Wage Computation");
		// variables
		int totalEmpHrs = 0;
		for (int i = 1; i <= 20; i++) {
			int randomNumber = (int) Math.floor(Math.random() * 10) % 3;
			int empHrs = 0;
			switch (randomNumber) {
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
				break;
			}
			totalEmpHrs += empHrs;
			int empWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage of month :  " + empWage);
		}
	}
}