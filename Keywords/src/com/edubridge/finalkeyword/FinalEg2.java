package com.edubridge.finalkeyword;

public class FinalEg2 extends FinalEg {
	   @SuppressWarnings("unused")
	private final String PASSPORTNO = "IND2034654";
	   private String dateOfexpiry;

	   public String getDateOfexpiry() {
	      return this.dateOfexpiry;
	   }

	   public void setDateOfexpiry(String dateOfexpiry) {
	      this.dateOfexpiry = dateOfexpiry;
	   }

	   public String getPASSPORTNO() {
	      return "IND2034654";
	   }

	   public String toString() {
	      return "FinalEg2 [PASSPORTNO=IND2034654, dateOfexpiry=" + this.dateOfexpiry + super.toString() + "]";
	   }

	   final void print() {
	      System.out.println("Final Method");
	   }

	   final void accept(int x) {
	      System.out.println(x);
	   }
	}
	    
