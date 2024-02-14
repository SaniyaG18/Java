package com.edubridge.exceptionhandling;
import java.util.Scanner;
public class MultiCatchBlock {
	 public static void displayArray(int[] arr) {
	      try {
	         System.out.println(arr[3]);
	      } catch (Exception var2) {
	         System.out.println(var2);
	      }
	   }
	   public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      int x = 45;
	      System.out.println("enter y: ");
	      int y = s.nextInt();

	      try {
	         System.out.println(x / y);
	      } catch (Exception var5) {
	         System.out.println(var5);
	      }

	      int[] arr = new int[]{12, 52, 36};
	      displayArray(arr);
	   }

}
