package com.edubridge.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

	public static void main(String[] args) {
		List<String>obj = Arrays.asList("Saniya","Abhirami","Annna");
		obj.stream().filter(i->i.isEmpty()).forEach(i->System.out.println(i));
		System.out.println(obj);
		//remove all elements
		List<String>res=obj.stream().filter(i->i.isEmpty()).collect(Collectors.toList());
		System.out.println(res);
		
		List<String>res1=obj.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
		System.out.println(res1);
		
		String res2=obj.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(res2);

	}

}
