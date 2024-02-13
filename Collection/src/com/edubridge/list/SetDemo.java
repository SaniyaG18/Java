package com.edubridge.list;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> obj = new HashSet<>(); //hashSet unordered
		obj.add("Saniya");
		obj.add("Abhirami");
		obj.add("Gawas");
		System.out.println(obj);
		Set<String> obj1 = new LinkedHashSet<>();
		obj1.add("Saniya");
		obj1.add("Abhirami");
		obj1.add("Siyaan");
		System.out.println(obj1);
		SortedSet<String> obj2 = new TreeSet<>();
		obj2.add("Saniya");
		obj2.add("Abhirami");
		obj2.add("Gawas");
		System.out.println(obj2);

	}

}
