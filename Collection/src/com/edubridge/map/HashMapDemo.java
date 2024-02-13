package com.edubridge.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> obj = new HashMap<>();
		obj.put(1,"Saniya");
		obj.put(2,"Abhirami");
		obj.put(1,"Pranav");
		obj.put(3, null);
		System.out.println(obj);
		System.out.println(obj.containsKey(1));
		//System.out.println(obj.remove(1));
		obj.remove(1, "Saniya");// it will remove all entries 0f key 1
		System.out.println(obj);

	}

}
