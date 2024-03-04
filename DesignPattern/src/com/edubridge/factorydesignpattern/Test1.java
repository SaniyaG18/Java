package com.edubridge.factorydesignpattern;

 class BOB implements Plan{
	@Override
	public void getroi(double rate) {
		System.out.println("HI "+rate);
		
	}
	}
 class BOI implements Plan{
		@Override
		public void getroi(double rate) {
			System.out.println("HI "+rate);
			
		}
		}
 class SBI implements Plan{
		@Override
		public void getroi(double rate) {
			System.out.println("HI "+rate);
			
		}
		}
public class Test1 {
	
	public static void main(String[] args) {
		
		BOB b1 = new BOB();
		b1.getroi(5.2);	
		@SuppressWarnings("unused")
		BOI b2 = new BOI();
		b1.getroi(6.3);	
		@SuppressWarnings("unused")
		SBI b3 = new SBI();
		b1.getroi(8.0);	
	}

}
