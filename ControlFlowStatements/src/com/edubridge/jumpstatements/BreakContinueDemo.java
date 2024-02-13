package com.edubridge.jumpstatements;

import java.util.Scanner;

public class BreakContinueDemo {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int a = s.nextInt();

      for(int i = 1; i <= n; ++i) {
         int j = 1;
         if (j <= a) {
            System.out.print(j + " ");
         }

         if (i != 5) {
            System.out.print(i + " ");
            if (i == 7) {
               break;
            }
         }
      }

   }
}
    