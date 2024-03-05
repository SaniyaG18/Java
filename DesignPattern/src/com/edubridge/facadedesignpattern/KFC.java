package com.edubridge.facadedesignpattern;

public class KFC implements Franchise {

	@Override
	public void Option() {
		System.out.println("KFC");
		
	}

	@Override
	public void Cost() {
		System.out.println("1,00,000Rs");
		
	}

}
