package com.employee;

public class EmployeeWages {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
	       
        int Wages_perhr=20;
        int Full_dayhr=8;
        int Part_timehr=4;
        int Workingday_permonth=20;
        int Total_workinghr=100;
        int totalHours=0;
        int day=0;
        int dailyWage=0;
        int totalWage=0;
        

       while ((totalHours < Total_workinghr) && (day < Workingday_permonth)) {
            int attendence = (int) (Math.floor(Math.random() * 10)) % 2;


            switch (attendence) {

                case 1:
                    dailyWage = Wages_perhr * Full_dayhr;
                    totalHours += Full_dayhr;
                    break;

                case 2:
                    dailyWage = Wages_perhr * Part_timehr;
                    totalHours =Part_timehr;
                    break;

                default:
                    break;
            }
            totalWage = dailyWage;
            day++;
        }
        System.out.println("Total work hours is : "+ totalHours);
        System.out.println("Total work days are: " + day);
        System.out.println("Total wage is: " + totalWage);


 }
}