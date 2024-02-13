package com.edubridge.variables;

public class VariablesDemo  {
			//instance variable
			float salary=78900.56f;
			//static variable
			static int x=10;
			
			String display()
			{
				//local variable
				char res='z';
				System.out.println(res);
				return "Local Variable";
			}

			public static void main(String[] args) {
				System.out.println(x);
				VariablesDemo obj=new VariablesDemo();
				System.out.println(obj.display());
				System.out.println(obj.salary);
		
	}

}
