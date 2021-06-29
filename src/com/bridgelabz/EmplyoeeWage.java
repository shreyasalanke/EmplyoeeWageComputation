package com.bridgelabz;

public class EmplyoeeWage {
	
	public static final int IS_EMP_PRESENT=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int NUMBER_OF_WORKING_DAYS=20;
	public static final int MAX_WORK_HOURS=100;
	
	public static void main(String[] args) 
	{
		int totalWorkingDays=0;
		int totalEmplyoeeHour=0;
		int monthlyWage=0;
		int empHrs=0;
	
		while(totalEmplyoeeHour < MAX_WORK_HOURS && totalWorkingDays < NUMBER_OF_WORKING_DAYS )
		{
			
		totalWorkingDays++;
		int dailyWage=0;
	    
		double empCheck = Math.floor(Math.random()*10)%3;
		
		 switch ((int)empCheck)
		 {
		  case IS_EMP_PRESENT:
			  empHrs=8;
			  break;
		  case IS_PART_TIME:	  
			  empHrs=4;
			  break;
		default:
			  empHrs=0;
			  System.out.println("emplyoee is absent");
		}
		 totalEmplyoeeHour= totalEmplyoeeHour + empHrs;
			dailyWage = WAGE_PER_HOUR * empHrs ;
			monthlyWage = monthlyWage + dailyWage ;
			
			System.out.println("Emplyoee Wage is : "+dailyWage);
		}
		System.out.println("monthly wage : " +monthlyWage);
		System.out.println("total Hrs : " +totalEmplyoeeHour);
	}
}