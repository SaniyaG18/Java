package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeClonable {
   @SuppressWarnings("unused")
public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the emplyoee Id:");
      @SuppressWarnings("unused")
	int empId = sc.nextInt();
      System.out.println("Enter the emplyoee Name:");
      @SuppressWarnings("unused")
	String empName = sc.next();
      System.out.println("Enter the emplyoee Salary:");
      long Salary = sc.nextLong();
      Employee e1 = new Employee(123, "Saniya", 50000L);
      Employee e2 = (Employee)e1.clone();
      e2.display();
      
      sc.close();
   }
}
