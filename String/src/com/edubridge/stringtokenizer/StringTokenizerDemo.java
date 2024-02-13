package com.edubridge.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	 public static void main(String[] args) {
	      StringTokenizer s = new StringTokenizer("hey hi there");
	      System.out.println(s.countTokens());
	      System.out.println(s.nextToken());
	      System.out.println(s.nextToken());

	      while(s.hasMoreTokens()) {
	         System.out.println(s.nextToken());
	      }

	      StringTokenizer a = new StringTokenizer("Edu-Bridge-India", "-", true);

	      while(a.hasMoreTokens()) {
	         System.out.println(a.nextToken());
	      }

	   }

}
