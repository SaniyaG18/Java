package com.edubridge.exceptionhandling;
import java.util.Scanner;
public class NewDemo {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      int x = 45;
	      System.out.println("enter y: ");
	      int y = s.nextInt();
	      int[] arr = new int[]{12, 52, 36};
	      try {
	         System.out.println(arr[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println(e);

	         try {
	            System.out.println(x / y);
	            System.exit(0);
	         } catch (Exception ae) {
	            System.out.println(ae);
	         }
	      } finally {
	         System.out.println("hello i am here");
	      }

	   }
	 
}
