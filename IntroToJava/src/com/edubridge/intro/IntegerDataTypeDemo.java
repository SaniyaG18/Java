package com.edubridge.intro;
import java.util.Scanner;
//program to demonstrate of Integral(byte,short,int,long)
public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte num=s.nextByte();
		short x=s.nextShort();
		int y=s.nextInt();
		long z=s.nextLong();
		System.out.println("The byte num value is: "+num);
		System.out.println("The short x value is: "+x);
		System.out.println("The int y value is: "+y);
		System.out.println("The long z value is: "+z);
		s.close();
	}
}