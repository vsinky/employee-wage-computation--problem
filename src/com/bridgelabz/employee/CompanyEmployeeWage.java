package com.bridgelabz.employee;

public class CompanyEmployeeWage {
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public String getCompany() {
		return company;
	}
	public int getEmpRatePerHour() {
		return empRatePerHour;
	}

	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}

	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}

	

	public CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
	}
}
