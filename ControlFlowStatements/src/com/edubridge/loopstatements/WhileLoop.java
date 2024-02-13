package com.edubridge.loopstatements;

import java.util.Scanner;

public class WhileLoop{
	   public static void main(String[] args) {
		      @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);

		      for(int n = s.nextInt(); n <= 10; ++n) {
		         System.out.print(n + " ");
		      }

		   }
		}
