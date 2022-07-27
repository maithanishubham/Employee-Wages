package com.employee;

public class EmployeeWages {

	public static void main(String[] args) {
		System.out.println("Welcome to Attendence");
		
		 int Attendance=1; 
		  double randomCheck= (Math.floor(Math.random()*10))%2;
		  if (Attendance==randomCheck) {
			  System.out.println("Employee is present");
			  
		  } else {
			  System.out.println("Employee is absent");
		  }

			}

}
