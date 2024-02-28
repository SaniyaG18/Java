package com.edubridge.practice;

import java.util.Scanner;

/*designation name salary no.of days present*/
public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the Employee:" );
		@SuppressWarnings("unused")
		String empname=sc.next();
		System.out.println("Designation of the Employee:" );
		String designation=sc.next();
		System.out.println("Total no. of days present in office:" );
		int presentDays=sc.nextInt();
		int perDayIncome;
		double salary;
		
		if(designation.equalsIgnoreCase("CEO")) {
			perDayIncome = 4000;
			salary= presentDays*perDayIncome;
			System.out.println("Days present:"+presentDays);
			System.out.println("Salary of CEO is: "+ salary);
		}
		else if(designation.equalsIgnoreCase("Manager")){
			perDayIncome = 2000;
			salary= presentDays*perDayIncome;
			System.out.println("Days present:"+presentDays);
			System.out.println("Salary of CEO is: "+ salary);
			}
		
		else if(designation.equalsIgnoreCase("Developer")) {
			perDayIncome = 1200;
			salary= presentDays*perDayIncome;
			System.out.println("Days present:"+presentDays);
			System.out.println("Salary of CEO is: "+ salary);
		}
		sc.close();
		}

}
