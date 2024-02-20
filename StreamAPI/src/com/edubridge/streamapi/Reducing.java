package com.edubridge.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

	public static void main(String[] args) {
		List<Integer>obj = Arrays.asList(12,35,78,32,65);
		Optional<Integer> res= obj.stream().reduce((x,y)->x*y);
		if(res.isPresent()) {
			System.out.println(res.get());
					}
		else {
			System.out.println("Not Present");
		}
	
	}
	

}
