package com.edubridge.finalkeyword;

public class FinalExecutor {
	   public static void main(String[] args) {
	      FinalEg2 f = new FinalEg2();
	      f.setCardName("Saniya");
	      f.setDateOfexpiry("August 2025");
	      System.out.println(f.getISSUER());
	      System.out.println(f.getPASSPORTNO());
	      System.out.println(f);
	      f.print();
	      f.accept(50);
	   }
	}
	   