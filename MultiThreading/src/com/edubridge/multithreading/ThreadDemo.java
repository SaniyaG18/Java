package com.edubridge.multithreading;
//By extending thread class
public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("Thread is running: " + Thread.currentThread());
		//Thread.currentThread() method will give current executing thread name.
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		ThreadDemo t1 = new ThreadDemo();
		
		for(int i=1;i<4;i++) {
			System.out.println(t1.getName() + " " + t.getName());
		}
		t.start();//start() method will automatically call run() method.
		t1.start();

	}

}
