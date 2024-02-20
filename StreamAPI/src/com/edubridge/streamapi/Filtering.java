package com.edubridge.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
	//First way to use stream
		List<String>obj = Arrays.asList("Saniya","Abhirami","Annna");
		obj.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));
		
		Stream<Integer>obj1= Stream.of(11,2,88,66,54);
		System.out.println(obj1.count());
		
		obj.stream().limit(2).forEach(i->System.out.print(i+" "));
		System.out.println();
		obj.stream().skip(2).forEach(i->System.out.print(i+" "));
		
		}
}
