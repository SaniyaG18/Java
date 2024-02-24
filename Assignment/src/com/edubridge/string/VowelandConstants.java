package com.edubridge.string;

import java.util.Scanner;

public class VowelandConstants {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int vowelcount=0;
		int constantcount=0;
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
				if(arr[i] =='a'||arr[i] =='e'||arr[i] =='i'||arr[i] =='o'||arr[i] =='u'||arr[i] =='A'||arr[i] =='E'||arr[i] =='I'||arr[i] =='O'||arr[i] =='U') {
				System.out.println(arr[i]+" is a vowel");
				vowelcount++;
			}
			else {
				System.out.println(arr[i]+" is a constant");
				constantcount++;
			
			}
		}
		System.out.println(vowelcount);
		System.out.println(constantcount);
	}
}

/*
 * 
 * */
