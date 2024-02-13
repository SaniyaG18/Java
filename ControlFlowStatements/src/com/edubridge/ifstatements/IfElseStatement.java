package com.edubridge.ifstatements;

import java.util.Scanner;

public class IfElseStatement  {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int A = s.nextInt();
      int B = s.nextInt();
      if (A == B) {
         System.out.println(A + " is equal to " + B);
      } else {
         System.out.println(A + " is not equal to " + B);
      }

      s.close();
   }
}
   