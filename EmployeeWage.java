package com.bridzlab.employeewageoops;
import java.util.Random;
public class EmployeeWage {
	static Random random = new Random();
	public static final int EMPLOYEE_PRESENT = 1, WAGE_PER_HOUR = 20, EMPLOYEE_PART_TIME=2;
	public static int empworkhours, dailywage;
	public static void main(String[] args) {
		EmployeeWage employeeWageObj = new EmployeeWage();
		employeeWageObj.welcomeDisplay();
		employeeWageObj.employeeAttendance();
		employeeWageObj.dailyWage(empworkhours,WAGE_PER_HOUR);
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
				System.out.println("Employee is Present\n");
				empworkhours=8;
				break;
			}	
			case EMPLOYEE_PART_TIME: {
				System.out.println("Employee is Part-time Present\n");
				empworkhours=4;
				break;
			}	
			default: {
				System.out.println("Employee is Absent\n");
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
		System.out.println(dailywage+" is the Employee daily wage");
	}
}