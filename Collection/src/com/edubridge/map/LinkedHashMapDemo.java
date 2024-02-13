package com.edubridge.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Object> obj = new LinkedHashMap<>();
		obj.put(1,"Saniya");
		obj.put(2,"Abhirami");
		obj.put(1,"Pranav");
		obj.put(3, null);
		System.out.println(obj);
		for(Map.Entry<Integer, Object> itr:obj.entrySet()) {
			System.out.println(itr.getValue()+" "+itr.getKey());
		}
	}

}
