package com.edubridge.multithreading;
//Thread 1
public class ThreadOne extends Thread{
	
	SynchronizeMethod m1;

	public ThreadOne(SynchronizeMethod m1) {
		super();
		this.m1 = m1;
	}
	
	public void run() {
		m1.print(5);
	}
}
