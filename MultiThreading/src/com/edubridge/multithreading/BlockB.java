package com.edubridge.multithreading;

public class BlockB extends Thread {
	Flat m1;

	public BlockB(Flat m1) {
		super();
		this.m1 = m1;
	}
	
	public void run() {
		m1.print(10);
	}

}
