package com.edubridge.factorydesignpattern;

abstract class CellularPlan {
	
	double rate;
	abstract void getrate();
	
	public void processbill(int min) {
		System.out.println(min*rate);
	}

}
