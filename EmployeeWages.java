package com.employee;

interface empWageBuilder{
	
	public void addCompanyEmpWage(String company, int wagePerhour, 
			                         int working_DayperMonth, int fullDayhour); 
	public void computeEmpWage();
	public int getTotalWage(String company);
}


public class EmployeeWages {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private Multiple_Companies[] companyEmpWageArray;
	
	public  EmployeeWages() {
		companyEmpWageArray = new Multiple_Companies[5];
	}
	
	private void addCompanyEmpWage(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
		companyEmpWageArray[numOfCompany] = new Multiple_Companies(company,wagePerhour,working_DayperMonth,fullDayhour );
	    numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
 			companyEmpWageArray[i].settotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);		
		}
	}
	
	public int computeEmpWage(Multiple_Companies Multiple_Companies) {
		  int totalWorkinghour = 0;
		  int days = 0; 
	      int empHrs = 0;	
	      while (totalWorkinghour <= Multiple_Companies.wagePerhour && days < Multiple_Companies.working_DayperMonth ){
			 days = days + 1;
			 int attendance = (int)(Math.random() *10 )%2;
			 switch(attendance){
				
				case IS_PART_TIME : empHrs = 4;
				                    break;
				
				case IS_FULL_TIME: empHrs = 8;
		                           break;
		    	        
				default: empHrs = 0;        
		       }
			 totalWorkinghour = totalWorkinghour + empHrs;
			// System.out.println(totalWorkinghour );
			 System.out.println("Day : " + days + " Emp hrs :" + empHrs);
			
	       }
	      return totalWorkinghour *Multiple_Companies.working_DayperMonth;
	}
	

	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWages empWage = new EmployeeWages();
		empWage.addCompanyEmpWage("Reliance",100,20,4);
		empWage.addCompanyEmpWage("Dmart",200,20,8);
		empWage.computeEmpWage();
	}
 
}