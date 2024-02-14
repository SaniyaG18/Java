package com.edubridge.classobjectdemo;

class Rectangle {
	   int area;
	   int perimeter;

	   Rectangle(int len, int bth) {
	      this.area = len * bth;
	      this.perimeter = 2 * (len + bth);
	   }

	   Rectangle() {
	      System.out.println("Rectangle");
	   }

	   public void area() {
	      System.out.println("Area of Rectangle = " + this.area + "\n Perimeter of Rectangle = " + this.perimeter);
	   }
	}