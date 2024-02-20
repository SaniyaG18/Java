package com.edubridge.multithreading;
public class SynchronizedBlock {
	
	public static void main(String[] args) {
		Flat f = new Flat();
		BlockA b1= new BlockA(f);
		BlockA b2= new BlockA(f);
		b1.start();
		b2.start();
	}
	}