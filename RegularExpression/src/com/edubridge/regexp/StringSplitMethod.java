package com.edubridge.regexp;
public class StringSplitMethod {
	public static void main(String[] args) {
		String str = "I Hate You";
		String[] str1 = str.split(" ");
		for(String s :str1) {
			System.out.print(s + "'");
		}
		System.out.println();
		String s1 = "There are 4 members in my family";
		String regex="\\d+";
		String res = s1.replaceAll(regex, "four");
		System.out.println(res);
	}
}
