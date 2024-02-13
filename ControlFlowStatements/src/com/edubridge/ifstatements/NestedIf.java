package com.edubridge.ifstatements;

import java.util.Scanner;

public class NestedIf {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
      int Age = s.nextInt();
      int Weight = s.nextInt();
      if (Age >= 18) {
         if (Weight >= 45 && Weight <= 100) {
            System.out.println(" He/She is eligible for Bunjee jumping ");
         } else {
            System.out.println(" He/She is Under/Over Weight for Bunjee jumping");
         }
      } else {
         System.out.println(" He/She is not eligible for Bunjee jumping");
      }

   }
}
    