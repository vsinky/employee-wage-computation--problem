package com.bridgelabz.employee;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// constants
		int IS_PRESENT = 1;
		double randomNumber = Math.floor(Math.random() * 10) % 2;

		if (IS_PRESENT == randomNumber) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}
}
