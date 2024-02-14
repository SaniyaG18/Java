package com.edubridge.polymorphism;

public class MethodOverRiding {
	   public static void main(String[] args) {
	      RideChildClass m = new RideChildClass();
	      m.print("Google Meet", "abc@gmail.com");
	      System.out.println(m instanceof RideParentClass);
	   }
	}
	    
