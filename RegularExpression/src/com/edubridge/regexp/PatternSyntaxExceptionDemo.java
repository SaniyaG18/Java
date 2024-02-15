package com.edubridge.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo {
	
	static String regex = "[";
	static String str = "I Hate You";
	static String replace = "Cat";
	
	public static void main(String[] args) {
		
		try {
			Pattern p= Pattern.compile(regex);
			@SuppressWarnings("unused")
			Matcher m = p.matcher(str);
		}
		catch(PatternSyntaxException e){
			System.out.println("PatternSyntaxException");
			System.out.println("Description:"+e.getDescription());
			System.out.println("Index:"+e.getIndex());
			System.out.println("Message:"+e.getMessage());
			
			
		}
		
	}

}
