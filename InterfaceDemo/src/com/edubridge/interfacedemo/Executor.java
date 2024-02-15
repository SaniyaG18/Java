package com.edubridge.interfacedemo;
import java.util.Scanner;

public class Executor {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Boruto b = new Boruto();
      int Children = s.nextInt();
      String Clan = s.next();
      String Position = s.next();
      b.power(Children, Position);
      b.power1(Children, Clan);
      s.close();
   }
}
    