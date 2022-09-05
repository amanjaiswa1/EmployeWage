package com.assignments.day3.EmployeeWage;

import java.util.*;

public class EmployeeWageCalculation {
	static int Wage_per_Hour = 20;
    static int Full_Day_Hour = 8;
    static int Part_Time_Hour = 4;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random ran = new Random();
        int attendance = ran.nextInt(3);

        switch (attendance) {
            case 1 : {
                System.out.println("Employee is Present for Full time");
                System.out.println("Employee`s Daily Wage is => "+Wage_per_Hour * Full_Day_Hour);break;
            } 
            case 2 : {
                System.out.println("Employee is Present for Part time");
                System.out.println("Employee`s Daily Wage is => "+Wage_per_Hour * Part_Time_Hour);break;
            } 
            default : System.out.println("Employee is Absent");break;
        }
    }
  }

