package com.bridgelabz;

public class EmplyoeeWage {
	
	public static final int IS_EMP_PRESENT= 1;
	public static final int IS_PART_TIME= 2;
	public static final int WAGE_PER_HOUR= 20;
	public static final int FULL_DAY_HOUR= 8;
	public static final int PART_TIME_HOUR= 4;
	
	public static void main(String[] args) {
		int dailyWage=0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if(empCheck == IS_EMP_PRESENT)
		{
			System.out.println("emplyoee is full time present");
			dailyWage=FULL_DAY_HOUR * WAGE_PER_HOUR;
		}
		else if (empCheck == IS_PART_TIME)
		{
			System.out.println("emplyoee is present part time");
			dailyWage=PART_TIME_HOUR *WAGE_PER_HOUR;
		}
		else
		{
			System.out.println("emplyoee is absent");
		}
		System.out.println("daily emplyoee wage is :"+dailyWage);
	}

}
