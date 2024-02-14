package com.edubridge.exceptionhandling;

import java.util.Scanner;

public class ArithmeticException {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      int x = 15;
	      int y = s.nextInt();
	      System.out.println("Enter y: ");

	      try {
	         System.out.println(x / y);
	         System.exit(0);
	      } catch (Exception var8) {
	         System.out.println("Exception Occured " + var8);
	         System.exit(0);
	      } finally {
	         System.out.println("hi");
	      }

	   }

}
