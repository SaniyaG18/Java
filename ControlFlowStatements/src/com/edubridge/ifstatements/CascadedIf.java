package com.edubridge.ifstatements;

import java.util.Scanner;

public class CascadedIf  {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int A = s.nextInt();
      int B = s.nextInt();
      if (A == B) {
         System.out.println(A + " is equal to " + B);
      } else if (A < B) {
         System.out.println(A + " is less than " + B);
      } else {
         System.out.println(A + " is greater than " + B);
      }

      s.close();
   }
}