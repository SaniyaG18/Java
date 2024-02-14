package com.edubridge.polymorphism;

public class RideChildClass extends RideParentClass {
	   String appName;
	   String emailId;

	   void print(String appName, String emailId) {
	      this.appName = appName;
	      this.emailId = emailId;
	      super.print("Google", "xyz@gmail.com");
	      System.out.println(appName + " " + emailId);
	   }

	   public static void main(String[] args) {
	   }
	}
	    
