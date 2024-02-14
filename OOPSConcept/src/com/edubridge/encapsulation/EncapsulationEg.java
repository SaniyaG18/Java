package com.edubridge.encapsulation;

public class EncapsulationEg extends EncapsulationEg2 {
	   private String CustomerName;
	   private long CustID;
	   private int PinNo;

	   public String getCustomerName() {
	      return this.CustomerName;
	   }

	   public void setCustomerName(String customerName) {
	      this.CustomerName = customerName;
	   }

	   public long getCustID() {
	      return this.CustID;
	   }

	   public void setCustID(long custID) {
	      this.CustID = custID;
	   }

	   public int getPinNo() {
	      return this.PinNo;
	   }

	   public void setPinNo(int pinNo) {
	      this.PinNo = pinNo;
	   }

	   public String toString() {
	      return "EncapsulationEg [CustomerName=" + this.CustomerName + ", CustID=" + this.CustID + ", PinNo=" + this.PinNo + super.toString() + "]";
	   }

	   public static void main(String[] args) {
	   }
	}
	    