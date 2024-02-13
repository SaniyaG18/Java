package com.edubridge.stringbuffer;

public class StringBufferDemo {
	 public static void main(String[] args) {
	      StringBuffer s = new StringBuffer("Hello How are you?");
	      System.out.println(s.capacity());
	      String b = new String("Abhirami");
	      StringBuffer a = new StringBuffer(b.length());
	      System.out.println(a.capacity());
	      StringBuffer c = new StringBuffer("  ");
	      System.out.println(c.capacity());
	      System.out.println(c.append("She is so sweet"));
	      System.out.println(s.charAt(1));
	      s.setCharAt(1, 'C');
	      System.out.println(s);
	   }

}
