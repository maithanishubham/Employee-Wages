package com.employee;

public class Multiple_Companies {

	 public String company;
		public int wagePerhour;
		public int working_DayperMonth;
		public int fullDayhour;
		public int totalEmpWage;
		public int maxhours_inMonth;
		
		public Multiple_Companies(String company, int wagePerhour, int working_DayperMonth, int fullDayhour) {
			this.company = company;
			this.wagePerhour = wagePerhour;
			this.working_DayperMonth = working_DayperMonth;
			this.fullDayhour = fullDayhour;
		}
		
		
		public int getTotalEmpWage() {
			return totalEmpWage;
		}

		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage = totalEmpWage;
		}

		public String toString() {
			return "Total Emp Wage for Company " + company + "is: " + totalEmpWage;
			
		}
		
	}


