package com.edubridge.streamapi;
import java.util.Arrays;
import java.util.List;
//Program to demonstrate on map.
public class MappingEg {

	public static void main(String[] args) {
		List<String>obj = Arrays.asList("Saniya","Abhirami","Annna");
		obj.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	}

}
