package com.edubridge.interfacedemo;
public class Employee implements Cloneable {
	   public int empId;
	   public String empName;
	   public long Salary;

	   public Employee(int empId, String empName, long Salary) {
	      this.empId = empId;
	      this.empName = empName;
	      this.Salary = Salary;
	   }

	   protected Object clone() throws CloneNotSupportedException {
	      return super.clone();
	   }

	   void display() {
	      System.out.println("Employee Id: " + this.empId);
	      System.out.println("Employee Name: " + this.empName);
	      System.out.println("Employee Salary: " + this.Salary);
	   }

	   public static void main(String[] args) {
	   }
	}
	    