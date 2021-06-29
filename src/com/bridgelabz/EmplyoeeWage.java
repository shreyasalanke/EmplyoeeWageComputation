package com.bridgelabz;

public class EmplyoeeWage {
	
	public static final int IS_EMP_PRESENT= 1;
	public static final int WAGE_PER_HOUR= 20;
	public static final int FULL_DAY_HOUR= 8;
	
	public static void main(String[] args) {
		int dailyWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == 1)
		{
			System.out.println("emplyoee is present");
			dailyWage=FULL_DAY_HOUR * WAGE_PER_HOUR;
		}
		else
		{
			System.out.println("emplyoee is absent");
		}
		System.out.println("daily emplyoee wage is :"+dailyWage);
	}

}
