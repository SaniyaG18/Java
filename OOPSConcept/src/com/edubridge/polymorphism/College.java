package com.edubridge.polymorphism;

class College {
	   String StudentName;
	   int rollno;
	   long Phoneno;

	   College(String StudentName, int rollno) {
	      this.StudentName = StudentName;
	      this.rollno = rollno;
	      System.out.println(StudentName + " " + rollno);
	   }

	   College(long Phoneno) {
	      this.Phoneno = Phoneno;
	      System.out.println(Phoneno);
	   }
	}
	    