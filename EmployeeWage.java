package com.bridzlab.employeewageoops;
import java.util.Random;
public class EmployeeWage {
	static Random random = new Random();
	public static final int EMPLOYEE_PRESENT = 1, WAGE_PER_HOUR=0, EMPLOYEE_PART_TIME=2, MONTH_DAYS=0, MONTH_HOURS=0; 
	public static int empworkhours, dailywage, monthlywage=0, totalworkhours=0;
	
	public static void main(String[] args) {
		EmployeeWage employeeWageObj = new EmployeeWage();
		employeeWageObj.welcomeDisplay();
		employeeWageObj.monthlyWage("Company0",20,20,100);
		EmployeeWage company1Obj = new EmployeeWage();
		company1Obj.monthlyWage("Company1",15,15,75);
		EmployeeWage company2Obj = new EmployeeWage();
		company2Obj.monthlyWage("Company1",25,25,150);
	}
	
	/**
	 * Displaying Welcome Message.
	 */
	public void welcomeDisplay() {
		System.out.println("Welcome to Employee Wage Computation Problem\n");
	}
	
	/**
	 * Calculating Monthly wage according to Class values
	 * @param dailywage, MONTH_DAYS, empworkhours
	 * @return monthlywage, totalworkhours
	 */
	public void monthlyWage(String COMPANY, int WAGE_PER_HOUR, int MONTH_DAYS, int MONTH_HOURS) {
		int i=1;
		while (totalworkhours<=MONTH_HOURS && i<=MONTH_DAYS) {
			int randm = random.nextInt(3);
			switch (randm) {
				case EMPLOYEE_PRESENT: {
					//System.out.println("Employee is Present\n");
					empworkhours=8;
					break;
				}	
				case EMPLOYEE_PART_TIME: {
					//System.out.println("Employee is Part-time Present\n");
					empworkhours=4;
					break;
				}	
				default: {
					//System.out.println("Employee is Absent\n");
					empworkhours=0;
				}
			}
			dailywage = (empworkhours * WAGE_PER_HOUR);
			monthlywage+=dailywage;
			totalworkhours+=empworkhours;
			i++;
		}
		System.out.println(COMPANY+" Salary of "+monthlywage+" is credited in "+(i-1)+"th day for "+totalworkhours+" Hours\n");
	}
}