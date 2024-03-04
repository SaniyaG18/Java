package com.edubridge.factorydesignpattern;

public class Executor {
	
	public CellularPlan getPlan(String PlanType) {
		
		if(PlanType==null) {
			return null;
		}
		if(PlanType.equalsIgnoreCase("abc")){
			return new abc();
		}
		else if(PlanType.equalsIgnoreCase("xyz")) {
			return new xyz();
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
