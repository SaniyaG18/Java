package com.edubridge.factorydesignpattern;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Executor e = new Executor();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter network name :");
		String networkname = s.next();
		System.out.println("Enter minutes :");
		int min = s.nextInt();
		
		CellularPlan p = e.getPlan(networkname);
		System.out.println("Bill");
		
		p.getrate();
		p.processbill(min);
	}

}
