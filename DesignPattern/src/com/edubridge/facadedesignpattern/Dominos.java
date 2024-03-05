package com.edubridge.facadedesignpattern;

public class Dominos implements Franchise {

	@Override
	public void Option() {
		System.out.println("Domino's");
	}

	@Override
	public void Cost() {
		System.out.println("1,50,000Rs");
		
	}

}
