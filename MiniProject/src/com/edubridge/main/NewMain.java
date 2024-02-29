package com.edubridge.main;
import java.util.Scanner;
import com.edubridge.dao.StudentDoa;
import com.edubridge.pojo.Student;

public class NewMain {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
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
			System.out.println("Enter Student Name:");
			String sname=sc.next();
			System.out.println("Enter Student City:");
			String scity=sc.next();
			System.out.println("Enter Student Phone Number:");
			String sphoneno = sc.next();
			Student s1 = new Student(sname,scity,sphoneno);
			StudentDoa.insertStudentData(s1);
			System.out.println("Data inserted successfully");
			break;
		case 2:
			System.out.println("Press 1 to update name");
			System.out.println("Press 2 to update city");
			System.out.println("Press 3 to update phoneno");
			System.out.println("Enter your choice:");
			int val = sc.nextInt();
			
			if(val==1)
			//update name
				{
				System.out.println("Enter name you want to update:");
				String sname1=sc.next();
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				StudentDoa.updateStudentData(val, sname1, id, s);
				}
			
			if(val==2)
			//update city
				{
				System.out.println("Enter city you want to update:");
				String city=sc.next();
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				StudentDoa.updateStudentData(val, city, id, s);
				
			}
			if(val==3)
			//update phone no
				{
				System.out.println("Enter phoneno you want to update:");
				String phone=sc.next();
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				StudentDoa.updateStudentData(val, phone, id, s);				
			}
			System.out.println("Data updated successfully");
			break;
			
		case 3:
			System.out.println("Enter id you want to delete:");
			int id = sc.nextInt();
			StudentDoa.deleteStudentData(id);
			System.out.println("Data deleted successfully");
			break;
			
		case 4:
			System.out.println();
			StudentDoa.displayStudentData();
			break;
		
		case 5:
			System.out.println("Exit");
		}

		}
		while(i!=5);
		
	}

}
