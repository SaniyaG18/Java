package com.edubridge.multithreading;
//By implementing a runnable interface
public class ThreadExecutor implements Runnable {
	public static void main(String[] args) {
		ThreadExecutor t = new ThreadExecutor();
		t.run();
	}
	@Override
	public void run() {
		for(int i=1;i<3;i++) {
		System.out.println("Thread " + i +" "+ Thread.currentThread());
		}
	}
}