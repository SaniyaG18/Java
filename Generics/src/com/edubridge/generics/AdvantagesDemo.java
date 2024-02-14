package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class AdvantagesDemo {

	public static void main(String[] args) {
		//type safety
		List<String> obj = new ArrayList<>();
		obj.add("Saniya");
		//obj.add(11); error because datatype is string 
		//it will show compile time error
		obj.add("11");
		
		//typecasting not required
		List<String> obj1 = new ArrayList<>();
		obj1.add("Saniya");
		obj1.add("Abhirami");
		String str = obj1.get(1);
		
		/*
		 * List<String> obj1 = new ArrayList<>();
		 * String str = (String) obj1.get(0);
		 * without generic typecasting is reuired*/
		System.out.println(str);


	}

}
