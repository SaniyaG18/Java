package com.edubridge.operators;

import java.util.Scanner;

public class ArithmeticOperators  {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Addition is: "+(a+b));
		System.out.println("Substraction is: " + (a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Quotient is: "+(a/b));
		System.out.println("Remainder is: "+(a%b));

		

	}

}
