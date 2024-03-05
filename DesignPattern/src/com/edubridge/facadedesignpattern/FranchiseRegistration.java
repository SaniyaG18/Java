package com.edubridge.facadedesignpattern;

public class FranchiseRegistration {
	
	Franchise KFC;
	Franchise Mcdonald;
	Franchise Dominos;
	
	public FranchiseRegistration() {
		super();
		KFC = new KFC();
		Mcdonald = new Mcdonald();
		Dominos = new Dominos();
	}
	
	
	public void buyKFC() {
		KFC.Cost();
		KFC.Option();
	}
	
	public void buyMCD() {
		Mcdonald.Cost();
		Mcdonald.Option();
	}
	
	public void buydominos() {
		Dominos.Cost();
		Dominos.Option();
	}
	}
