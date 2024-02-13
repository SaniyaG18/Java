package com.edubridge.loopstatements;

import java.util.Scanner;

public class DoWhileLoop  {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      do {
         System.out.print(n + " ");
         ++n;
      } while(n <= 20);

   }
}