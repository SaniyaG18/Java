package com.edubridge.thiskeyword;

class Account {
	   public long accNo;
	   public String Branch;

	   public void setData(long accNo, String Branch) {
	      this.accNo = accNo;
	      this.Branch = Branch;
	   }

	   public void display() {
	      System.out.println(this.accNo + " " + this.Branch);
	   }
	}