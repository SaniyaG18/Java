package com.edubridge.intro;
import java.util.Scanner;
public class UserInputDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char x=s.next().charAt(0);
		boolean res = false;
		System.out.println(str);
		System.out.println(x);
		System.out.println(res);
		System.out.println("res");
		s.close();
	}
}