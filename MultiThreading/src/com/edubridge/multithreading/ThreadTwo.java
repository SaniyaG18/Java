package com.edubridge.multithreading;
//Thread 2
public class ThreadTwo extends Thread{
	
	SynchronizeMethod m2;

	public ThreadTwo(SynchronizeMethod m2) {
		super();
		this.m2 = m2;
	}
	
	public void run() {
		m2.print(10);
	}

}
