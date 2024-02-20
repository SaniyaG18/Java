package com.edubridge.multithreading;

public class StaticSynchronizeDemo {
	
	public static void main(String[] args) {
	Welcome w1 = new Welcome();
	MyThread m1 = new MyThread(w1);
	MyThread m2 = new MyThread(w1);
	m2.setPriority(2);
	m1.setPriority(10);
	m1.start();
	m2.start();
	}
}
