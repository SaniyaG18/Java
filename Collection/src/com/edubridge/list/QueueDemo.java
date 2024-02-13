package com.edubridge.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//can't create interface object
		//Queue<Object> obj = new Queue<>();
		Queue<Integer> obj = new PriorityQueue<>();
		obj.add(5);
		obj.add(36);
		obj.add(40);
		obj.add(8);
		System.out.println(obj);
		
		
	}

}
