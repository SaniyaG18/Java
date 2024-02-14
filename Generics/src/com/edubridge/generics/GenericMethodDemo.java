package com.edubridge.generics;

public class GenericMethodDemo {
	
	public static <E> void print(E[] arr) {
		for(E i:arr) {
		System.out.print(i+" ");
	} 
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] array1 = {1,2,3,4,5};
		String[] array2 = {"Saniya","Abhirami","Gawas","Chettiar"};
		GenericMethodDemo.print(array1);
		GenericMethodDemo.print(array2);
	}

}
