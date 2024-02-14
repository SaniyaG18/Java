package com.edubridge.encapsulation;

public class EncapsulationEg3 {
	   public static void main(String[] args) {
		      EncapsulationEg e = new EncapsulationEg();
		      e.setCustID(3837369L);
		      e.setCustomerName("Saniya");
		      e.setPinNo(1234);
		      e.setBranch("Kalyan");
		      e.setIFSCcode(454531543L);
		      System.out.println(e);
		      System.out.println(e.getBranch());
		   }
		}
