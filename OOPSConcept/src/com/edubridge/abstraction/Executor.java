package com.edubridge.abstraction;
import java.util.Scanner;

public class Executor {
   public static void main(String[] args) {
      ISRO i1 = new ISRO();
      @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      i1.displayDetails(i1.setAgencyName(sc.nextLine()), i1.setBudget(sc.nextLong()));
      i1.displayDetails();
      String str = i1.print();
      System.out.println(str);
   }
}