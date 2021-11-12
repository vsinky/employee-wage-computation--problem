package com.bridgelabz.employee;

public interface EmployeeWageService {
	void addEmpWage(CompanyEmployeeWage company);

	void computeEmpWage();
	int getTotalWage(String company);
}
