package com.edubridge.stringbuilder;

public class StringBuilderDemo {
	 public static void main(String[] args) {
	      StringBuilder b = new StringBuilder("");
	      System.out.println(b.capacity());
	      StringBuilder a = new StringBuilder("Saniya");
	      System.out.println(a.capacity());
	      StringBuilder c = new StringBuilder("Hii Abhirami, How are you?");
	      System.out.println(c.capacity());
	   }

}
