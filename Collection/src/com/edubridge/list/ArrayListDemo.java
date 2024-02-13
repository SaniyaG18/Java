package com.edubridge.list;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		/*we can't create the object for Collection interface*/
		//Collection<Integer>obj = new Collection<>();
		
		List<String> obj = new ArrayList<>();
		obj.add("Saniya");
		obj.add("Abhirami");
		obj.add("Pranav");
		System.out.println(obj);
		List<Object> obj1 = new ArrayList<>();
		obj1.add("Saniya");
		obj1.add(1234);
		obj1.add(50.6);
		System.out.println(obj1);
		List<Object> obj2 = new ArrayList<>();
		obj2.addAll(obj1);
		System.out.println(obj2);
		System.out.println(obj1.get(1));
		obj2.remove(2);
		System.out.println(obj2);
		
	}

}
