package com.edubridge.abstraction;

public class ISRO extends GovernmentAgency {
	   void displayDetails() {
	      System.out.println("Indian Space Research Organization");
	   }

	   void displayDetails(String agencyName, long budget) {
	      System.out.println("Agency Name: " + agencyName + " , Budget : " + budget);
	   }
	}
	    
