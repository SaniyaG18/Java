package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		//Deque
				Deque<Integer> obj1 = new LinkedList<>();
				obj1.add(5);
				obj1.add(36);
				obj1.add(40);
				obj1.add(8);
				System.out.println(obj1);
				obj1.addFirst(2);
				obj1.addLast(6);
				System.out.println(obj1);
				obj1.removeLast();
				System.out.println(obj1);
				System.out.println(obj1.peek());
				obj1.pollLast();
				obj1.pollLast();
				obj1.pollLast();
				obj1.pollLast();
				obj1.pollLast(); //elements are 4 but we are removing 5 elements no error
				/*obj1.removeLast();
				obj1.removeLast();
				obj1.removeLast();
				obj1.removeLast();
				obj1.removeLast(); this extra removal of element will show exception*/
				System.out.println(obj1);
				

	}

}
