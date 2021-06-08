package com.bridzlab.employeewageoops;
import java.util.Random;
public class EmployeeWage {
	static Random random = new Random();
	public static final int EMPLOYEE_PRESENT = 1;
	public static void main(String[] args) {
		EmployeeWage employeeWageObj = new EmployeeWage();
		employeeWageObj.welcomeDisplay();
		employeeWageObj.employeeAttendance();
	}
	
	/**
	 * Displaying Welcome Message.
	 */
	private void welcomeDisplay() {
		System.out.println("Welcome to Employee Wage Computation Problem\n");
	}
	
	/**
	 * Checking if Employee is present or absent by calling random
	 */
	public void employeeAttendance() {
		int randm = random.nextInt(2);
		if (randm == EMPLOYEE_PRESENT) {
			System.out.println("Employee is Present");
		}	
		else {
			System.out.println("Employee is Absent");
		}
	}
}