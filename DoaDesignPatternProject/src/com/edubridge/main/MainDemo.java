package com.edubridge.main;

import java.util.Scanner;

import com.edubridge.doa.ProductDoa;
import com.edubridge.pojo.Product;

public class MainDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Product p = new Product();
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
			System.out.println("Enter Product Name:");
			String pname=sc.next();
			System.out.println("Enter Product Price:");
			int price=sc.nextInt();
			System.out.println("Enter Product Quantity:");
			int quantity = sc.nextInt();
			Product p1 = new Product(pname,price,quantity);
			ProductDoa.insertData(p1);
			System.out.println("Data inserted successfully");
			break;
		case 2:
			System.out.println("Press 1 to update name");
			System.out.println("Press 2 to update price");
			System.out.println("Press 3 to update quantity");
			System.out.println("Enter your choice:");
			int val = sc.nextInt();
			
			if(val==1)
			//update name
				{
				System.out.println("Enter name you want to update:");
				String sname1=sc.next();
//				Product p2 = new Product();
				p.setpName(sname1);
				System.out.println("Enter Id:");
				int id = sc.nextInt();
				ProductDoa.updateData(val,id, p);
				}
			
			if(val==2)
			//update price
				{
				System.out.println("Enter price you want to update:");
				int price1=sc.nextInt();
//				Product p2 = new Product();
				p.setPrice(price1);
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				ProductDoa.updateData(val, id, p);
				
			}
			if(val==3)
			//update quantity
				{
				System.out.println("Enter quantity you want to update:");
				int quantity1=sc.nextInt();
//				Product p2 = new Product();
				p.setPrice(quantity1);
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				ProductDoa.updateData(val, id, p);				
			}
			System.out.println("Data updated successfully");
			break;
			
		case 3:
			System.out.println("Enter id you want to delete:");
			int id = sc.nextInt();
			ProductDoa.deleteData(id);
			System.out.println("Data deleted successfully");
			break;
			
		case 4:
			System.out.println();
			ProductDoa.displayData();
			break;
		
		case 5:
			System.out.println("Exit");
		}

		}
		while(i!=5);
		
	}


	}


