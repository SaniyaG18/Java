package com.edubridge.equalsdemo;
public class DemoExecutor {
	public static void main(String[] args) {
		String str1 ="Saniya";
		String str2 ="Saniya";
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 =new String("Abhirami");
		String str4 =new String("Abhirami");
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		Demo d = new Demo("Saniya",1);
		Demo d1 = new Demo("Saniya",1);
		System.out.println(d.equals(d1));
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		

	}

}
