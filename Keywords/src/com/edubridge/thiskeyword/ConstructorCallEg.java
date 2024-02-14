package com.edubridge.thiskeyword;

public class ConstructorCallEg {
	   public int a;

	   ConstructorCallEg() {
	      this(10);
	      System.out.println("hello non parameterized ");
	   }

	   ConstructorCallEg(int a) {
	      System.out.println("Parameterized Constructor");
	      System.out.println(a);
	   }

	   public static void main(String[] args) {
	      
	   }
	}
	    
