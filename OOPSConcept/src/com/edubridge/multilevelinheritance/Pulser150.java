package com.edubridge.multilevelinheritance;

public class Pulser150 extends Pulser {
	   public int speed;
	   public int price;

	   public Pulser150(int speed, int price) {
	      super(speed, price);
	      this.speed = speed;
	      this.price = price;
	   }

	   public String toString() {
	      return "Pulser150 [speed=" + this.speed + ", price=" + this.price + super.toString() + "]";
	   }

	   public static void main(String[] args) {
	   }
	}
