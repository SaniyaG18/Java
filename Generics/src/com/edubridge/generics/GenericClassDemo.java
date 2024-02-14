package com.edubridge.generics;
class GenericDemo<T>{
	T str;
	T str1;

	public void print(T str, T str1) {
		this.str = str;
		this.str1 = str1;
		System.out.println("The value are " + str + " " + str1);
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericDemo<String> GD = new GenericDemo<>();
		GD.print("Saniya", "Abhirami");

	}

}
