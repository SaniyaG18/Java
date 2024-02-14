package com.edubridge.heirarchialinheritance;

public class Executor {
	 public static void main(String[] args) {
	      Tiramisu t = new Tiramisu();
	      SnowCone s = new SnowCone();
	      t.DeviceName = "Realme";
	      t.version = "14F";
	      s.DeviceName = "Samsung";
	      s.version = "13A";
	      t.print();
	      s.print();
	   }

}
