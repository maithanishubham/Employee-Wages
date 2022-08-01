package com.employee;
import java.util.ArrayList;

interface ComputeEmpWage{
	public void addCompanyEmpWage(String company, int wagePerhour, 
			                         int working_DayperMonth, int fullDayhour); 
	public void computeEmpWage();
	public int getTotalWage(String company);
}

public class EmployeeWages {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 2;
	private int maxhours_inMonth = 100;
	private ArrayList< Multiple_Companies> list;
	
	public  EmployeeWages() {
		list = new ArrayList<>();
	}
	
	private void addCompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		 Multiple_Companies companyEmpWage= new   Multiple_Companies(company,wagePerhour,working_DayperMonth,fullDayhour );
	    list.add(companyEmpWage);
	}
	
	private void computeEmpWage() {
		for(int i=0;i<list.size();i++) {
			 Multiple_Companies companyEmpWage = list.get(i);
 			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);		
		}
	}
	
	
	public int computeEmpWage( Multiple_Companies  companyEmpWage) {
		  int totalWorkinghour = 0;
		  int days = 0; 
	      int empHrs = 0;
	      int dailyEmpWage=0;
	      System.out.println();
	      System.out.println(companyEmpWage.company);
	      while(totalWorkinghour <= maxhours_inMonth  && days < companyEmpWage.working_DayperMonth ) {
			 days = days + 1;
			 int attendance = (int)(Math.random() *10 )%3;
			 switch(attendance){
				
				case IS_PART_TIME : empHrs = 4;
				                    dailyEmpWage = companyEmpWage.wagePerhour * empHrs;
				                    System.out.println("Part Time Employee wages :" + 
		                                    "\nWages Per Hour :\t"+ companyEmpWage.wagePerhour +
		                                    "\nWorking Days   :\t"+ companyEmpWage.working_DayperMonth+
		                                    "\nWorking Hour   :\t"+ empHrs +
		                                    "\nDaily Wage of an Employee : " + dailyEmpWage);
				                    break;
				
				case IS_FULL_TIME : empHrs = 8;
				                    dailyEmpWage = companyEmpWage.wagePerhour * empHrs;
				                    System.out.println("Full Time Employee wages :" + 
	                                    "\nWages Per Hour :\t"+ companyEmpWage.wagePerhour +
	                                    "\nWorking Days   :\t"+ companyEmpWage.working_DayperMonth+
	                                    "\nWorking Hour   :\t"+ empHrs +
	                                    "\nDaily Wage of an Employee : " + dailyEmpWage);
				
		                            break;
		    	        
				default: empHrs = 0;
				         System.out.println("Employee wage is zero");
		       }
			 totalWorkinghour = totalWorkinghour + empHrs;
			 System.out.println("");
	      }
		return totalWorkinghour * companyEmpWage.wagePerhour ;
	   }
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation ");
		EmployeeWages empWage = new EmployeeWages();
		empWage.addCompanyEmpWage("amazon",100,20,8);
		empWage.addCompanyEmpWage("Flipkart",200,20,8);
		empWage.computeEmpWage();
	}
	
}