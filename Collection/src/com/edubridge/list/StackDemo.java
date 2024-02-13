package com.edubridge.list;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> obj = new Stack<>();
		obj.add("Saniya");
		obj.add(8);
		obj.add(6);
		System.out.println(obj);
		obj.push(66);//add 66 to list
		obj.push(73);//add 73 to list
		obj.pop();// remove 73 from list
		System.out.println(obj);
	}

}
