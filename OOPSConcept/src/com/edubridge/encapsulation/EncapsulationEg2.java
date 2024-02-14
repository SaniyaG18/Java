package com.edubridge.encapsulation;

public class EncapsulationEg2  {
	   private String Branch;
	   private long IFSCcode;

	   public String getBranch() {
	      return this.Branch;
	   }

	   public void setBranch(String branch) {
	      this.Branch = branch;
	   }

	   public long getIFSCcode() {
	      return this.IFSCcode;
	   }

	   public void setIFSCcode(long iFSCcode) {
	      this.IFSCcode = iFSCcode;
	   }

	   public String toString() {
	      return "EncapsuleEg2 [Branch=" + this.Branch + ", IFSCcode=" + this.IFSCcode + "]";
	   }

	   public static void main(String[] args) {
	   }
	}
	    
