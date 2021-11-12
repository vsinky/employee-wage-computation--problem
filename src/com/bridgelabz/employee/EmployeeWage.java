package com.bridgelabz.employee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage implements EmployeeWageService {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private ArrayList<CompanyEmployeeWage> companyEmpWageList;

	public EmployeeWage() {
		companyEmpWageList = new ArrayList<CompanyEmployeeWage>();
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmployeeWage companyEmpWage = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {

			CompanyEmployeeWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		int totalWage = 0;

		for (int i = 0; i < companyEmpWageList.size(); i++) {
			if (company.equals(companyEmpWageList.get(i).getCompany())) {
				totalWage = companyEmpWageList.get(i).getTotalEmpWage();
				break;
			}
		}
		return totalWage;
	}
	private int computeEmpWage(CompanyEmployeeWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= companyEmpWage.getMaxHoursPerMonth()
				&& totalWorkingDays < companyEmpWage.getNumOfWorkingDays()) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.getEmpRatePerHour();
	}

	public static void main(String[] args) {
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompanyEmpWage("DMart", 20, 2, 10);
		employeeWage.addCompanyEmpWage("jio", 10, 4, 20);
		employeeWage.addCompanyEmpWage("big", 30, 6, 10);
		employeeWage.computeEmpWage();
		System.out.println("Enter the Company name");
		Scanner sc=new Scanner(System.in);
		String company=sc.next();
		int totalCompanyWage=employeeWage.getTotalWage(company);
		if(totalCompanyWage>0) {
		System.out.print(company +" = " +totalCompanyWage);
		}
		else
			System.out.print("There is no company name with "+company);
	}

	@Override
	public void addEmpWage(CompanyEmployeeWage company) {
		// TODO Auto-generated method stub

	}
}