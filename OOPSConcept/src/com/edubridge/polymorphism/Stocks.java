package com.edubridge.polymorphism;

class Stocks {
	   String ShareName;
	   long SharePrice;
	   String ShareType;

	   void display(String ShareName, long SharePrice) {
	      System.out.println(ShareName + " " + SharePrice);
	   }

	   void display(String ShareType) {
	      System.out.println(ShareType);
	   }
	}