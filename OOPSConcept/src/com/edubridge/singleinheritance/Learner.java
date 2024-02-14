package com.edubridge.singleinheritance;

public class Learner extends Trainer {
	   public String LearnerName = "";
	   public int rollno;

	   void print() {
	      System.out.println("Student Name: " + this.LearnerName + "\nRoll No : " + this.rollno);
	   }

	   public static void main(String[] args) {
	   }
	}
