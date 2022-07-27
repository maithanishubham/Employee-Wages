package com.employee;

public class EmployeeWages {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Attendance");
		 int dailyWage = 0;
		 int noofpartHourperday = 4;
		 int noOfhourperday = 8;
		 int Wageperhr = 20;
		     int attendence= (int) (Math.floor(Math.random()*10))%2;
		     
		switch (attendence) {

		case 1:
			System.out.println("Employee is Working Full Time");
			dailyWage= Wageperhr * noOfhourperday;
			System.out.println(" Employee daily wage is :" + dailyWage );
		  break;
		case 0:
		    System.out.println("Employee is working part time");
		    dailyWage= Wageperhr * noofpartHourperday ;
		    System.out.println("Employee daily wage is: "+ dailyWage);
		    break;

		 default :
		 System.out.println("Employee is absent");
		    break;
		}
	}
}

		
		