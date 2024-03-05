package com.edubridge.facadedesignpattern;

public class Mcdonald implements Franchise {

	@Override
	public void Option() {
		System.out.println("Mc Donald's");
		
	}

	@Override
	public void Cost() {
		System.out.println("1,20,000Rs");
		
	}

}
