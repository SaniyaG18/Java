package com.edubridge.list;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<>();
		obj.add(5);
		obj.add(8);
		obj.add(6);
		System.out.println(obj);
		obj.add(0, 18);
		System.out.println(obj);
		//obj.clear();
		//System.out.println(obj);
		
		//Enhance for Loop
		Collections.reverse(obj);
		for(Integer itr:obj)
		{
			System.out.print(itr+" ");
		}
		//error
		/*Iterator<Integer> itr = obj.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr +" ");
		}*/

	}

}
