package com.assignments.day3.EmployeeWage;

import java.util.*;

public class EmployeeWageCalculation {
	    static int Wage_per_Hour = 20;
	    static int Full_Day_Hour = 8;
	    static int Part_Time_Hour = 4;
	    static int Working_Day_per_Month = 20;
	    static int Total_Working_Hour = 100;
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program");
	        int totalWage = 0;
	        int dayCount = 1;
	        int workingHours = 0;
	        while (dayCount <= Working_Day_per_Month && workingHours < Total_Working_Hour) {
	            Random ran = new Random();
	            int attendance = ran.nextInt(3);
	            int employeeWage = 0;
	            switch (attendance) {
	                case 1 : {
	                    System.out.println("\nEmployee is Present for Full time.");
	                    employeeWage = Wage_per_Hour * Full_Day_Hour;
	                    workingHours += Full_Day_Hour;break;
	                }
	                case 2 : {
	                    System.out.println("\nEmployee is Present for Part time.");
	                    employeeWage = Wage_per_Hour * Part_Time_Hour;
	                    workingHours += Part_Time_Hour;break;
	                }
	                default : System.out.println("\nEmployee is Absent.");break;
	            }
	            totalWage += employeeWage;
	            System.out.println("Employee Wage for day "+dayCount+" is: "+employeeWage);
	            dayCount++;
	        }
	        System.out.println("\nTotal Monthly Wage of Employee is: "+totalWage);
	        System.out.println("Total Working Hours are: "+workingHours);
	    }
  }

