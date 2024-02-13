package com.edubridge.operators;

public class IncreementDecrementOperators {

	public static void main(String[] args) {
		  int a = 6;
	      int b = 3;
	       a = a + 1;
	       b = b + 1;
	      @SuppressWarnings("unused")
		int res = a - b;
	      --a;
	      @SuppressWarnings("unused")
		int res2 = a + b--;
	      System.out.println(a);
	      System.out.println(b);
	}

}