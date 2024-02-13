package com.edubridge.map;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Object> obj = new Hashtable<>();
		obj.put(1,"Saniya");
		obj.put(2,"Abhirami");
		obj.put(3,"Pranav");
		//We can't use null value in hash table.it will throw error.
		//obj.put(3, null);
		System.out.println(obj);

	}

}
