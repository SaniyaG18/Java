package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String,Float>obj = new TreeMap<>();
		obj.put("Saniya", 88.8f);
		obj.put("Abhirami",92.5f);
		obj.put("Priyanka",89.5f);
		System.out.println(obj);
		for(Map.Entry<String, Float> itr:obj.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}

	}

}
