package com.edubridge.operators;

import java.util.Scanner;

//program to demonstrate on Relational Operator
public class RelationalOperators {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);


	}

}
