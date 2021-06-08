package com.bridzlab.employeewageoops;
import java.util.Random;
public class EmployeeWage {
	static Random random = new Random();
	public static final int EMPLOYEE_PRESENT = 1, WAGE_PER_HOUR = 20, EMPLOYEE_PART_TIME=2, MONTH_DAYS=20;
	public static int empworkhours, dailywage, monthlywage=0;
	static EmployeeWage employeeWageObj = new EmployeeWage();
	public static void main(String[] args) {
		employeeWageObj.welcomeDisplay();
		employeeWageObj.monthlyWage();
	}
	
	/**
	 * Displaying Welcome Message.
	 */
	public void welcomeDisplay() {
		System.out.println("Welcome to Employee Wage Computation Problem\n");
	}
	
	/**
	 * Checking if Employee is Present, Part-Time or absent by calling random
	 * Assigning working hours for each case 
	 */
	public void employeeAttendance() {
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
	}
	
	/**
	 * Calculating daily employee wage
	 * @param empworkhours, WAGE_PER_HOUR
	 */
	public void dailyWage(int empworkhours, int WAGE_PER_HOUR) {
		dailywage = (empworkhours * WAGE_PER_HOUR);
		//System.out.println(dailywage+" is the Employee daily wage\n");
	}
	
	/**
	 * Calculating monthly employee wage
	 * @param dailywage, MONTH_DAYS
	 */
	public void monthlyWage() {
		for (int i=1;i<=MONTH_DAYS;i++) {
			employeeWageObj.employeeAttendance();
			employeeWageObj.dailyWage(empworkhours,WAGE_PER_HOUR);
			monthlywage+=dailywage;
		}
		System.out.println(monthlywage+" is the Employee monthly wage\n");
	}
}