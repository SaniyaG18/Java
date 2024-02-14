package com.edubridge.multilevelinheritance;

public class Pulser220 extends Pulser150 {
	   public int speed;
	   public int price;

	   public Pulser220(int speed, int price) {
	      super(speed, price);
	      this.speed = speed;
	      this.price = price;
	   }

	   public String toString() {
	      return "Pulser220 [speed=" + this.speed + ", price=" + this.price + super.toString() + "]";
	   }

	   public static void main(String[] args) {
	   }
	}