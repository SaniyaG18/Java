package com.edubridge.thiskeyword;

 public class MethodCallEg {
	   void printOne(MethodCallEg m) {
		      System.out.println("Hii");
		   }

		   void printTwo() {
		      this.printOne(this);
		   }

		   public static void main(String[] args) {
		      MethodCallEg m = new MethodCallEg();
		      m.printTwo();
		   }
		}
		    
