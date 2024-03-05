package com.edubridge.facadedesignpattern;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int i=0;
		do {
		System.out.println("Press 1 for KFC");
		System.out.println("Press 2 for Dominos");
		System.out.println("Press 3 for McD");
		System.out.println("Press 4 to Exit");
		System.out.println("Enter your Choice: ");
		i = sc.nextInt();
		
		FranchiseRegistration f = new FranchiseRegistration();
		
		switch(i) {
		case 1:
			f.buyKFC();
			break;
		case 2:
			f.buydominos();
			break;
		case 3:
			f.buyMCD();
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong choice");
		}

	}while(i!=4);

}
}
