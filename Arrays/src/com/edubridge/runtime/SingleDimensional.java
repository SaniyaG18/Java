package com.edubridge.runtime;

import java.util.Scanner;

public class SingleDimensional  {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		//to initialize an array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		//to print an array elements
		for(int i=0;i<n;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
	}
	

}
