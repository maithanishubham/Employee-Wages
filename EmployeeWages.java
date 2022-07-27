package com.employee;

public class EmployeeWages {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Attendance");
		 int Part_time = 1;
		   int  Full_time = 2;
		   int WAGE_PER_HR = 20;
		   int WORKING_DAYS = 20;
		   int totalWage = 0;
		   
		   for (int i = 1; i <= WORKING_DAYS; i++)
		   {
		       int empType = (int) (Math.random() * 10 ) % 2;
		       int workingHours =0;
		       switch (empType)
		       {
		           case 1:
		               workingHours = 4;
		               break;
		           case 2:
		               workingHours = 8;
		               break;
		           default:
		       }
		       
		       int wage = workingHours * WAGE_PER_HR;
		       System.out.println("Day " + i + " wage is:" + wage);
		       totalWage += wage;
		   }
		   System.out.println("Total wage for a month is " + totalWage);        
	}
}
		
		