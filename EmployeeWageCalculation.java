package com.assignments.day3.EmployeeWage;

import java.util.*;

public class EmployeeWageCalculation {
	    public final static int perHourWage = 20;
	    public final static int fullTime = 1;
	    public final static int partTime = 2;
	    static int workingDayPerMonth = 20;
	    static int totalWorkingHour = 100;
	    
	    public static void calculateEmployeeWage() {
	        System.out.println("Welcome to Employee Wage Computation Program");
	        int totalEmployeeWorkHour = 0;
	        int dayCount = 0;
	        int workingHours;
	        Random ran = new Random();
	        
	        while (dayCount < workingDayPerMonth && totalEmployeeWorkHour <= totalWorkingHour) {
	        	dayCount++ ;
	        	int attendance = ran.nextInt(3);
	            switch (attendance) {
	                case fullTime : {
	                    workingHours = 8;break;
	                }
	                case partTime : {
	                    workingHours = 4;break;
	                }
	                default : workingHours = 0;break;
	            }
	            int wage = workingHours * perHourWage;
	            System.out.println("Day "+dayCount+" Work Hour : "+workingHours+" & Wage : "+wage);
	            totalEmployeeWorkHour += workingHours;
	        }
	        int totalEmployeeWage = totalEmployeeWorkHour * perHourWage;
	        System.out.println("\nTotal Monthly Wage of Employee is: "+totalEmployeeWage);
	        System.out.println("Total Working Hours are: "+totalEmployeeWorkHour);
	    }
	    public static void main(String[] args) {
	        calculateEmployeeWage();
	    }
  }

