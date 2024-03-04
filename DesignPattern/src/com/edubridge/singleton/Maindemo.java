package com.edubridge.singleton;
import java.sql.SQLException;
import java.util.Scanner;
public class Maindemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Singleton creational design pattern");
		Singleton jdbc = Singleton.getInstance();
		String name = sc.next();
		System.out.println("Welcome "+name);
		int i=0;
		do {
		System.out.println("Press 1 to insert data");
		System.out.println("Press 2 to update data");
		System.out.println("Press 3 to delete data");
		System.out.println("Press 4 to display data");
		System.out.println("Press 5 to exit");
		System.out.println("Enter your Choice: ");
		i = sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Enter Employee Id:");
			int id=sc.nextInt();
			System.out.println("Enter Employee Username:");
			String uname=sc.next();
			System.out.println("Enter Employee Password:");
			String pwd = sc.next();
			int j = jdbc.insert(uname, pwd, id);
			System.out.println("Data inserted successfully");
			break;
		case 2:
			System.out.println("Press 1 to update Id");
			System.out.println("Enter password you want to update:");
			String sname1=sc.next();
			System.out.println("Enter Id:");
			int eid=sc.nextInt();
			int k = jdbc.update(sname1, eid);
			System.out.println("Data updated successfully");
			break;
		case 3:
			System.out.println("Enter id you want to delete:");
			int empid = sc.nextInt();
			int l = jdbc.delete(empid);
			System.out.println("Data deleted successfully");
			break;
		case 4:
			int r = jdbc.View();
			System.out.println();
			break;
		case 5:
			System.out.println("Exit");
		}
		}
		while(i!=5);
		sc.close();
	}
	}