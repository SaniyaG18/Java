package com.edubridge.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.edubridge.dbconnect.ConnectClass;

import com.edubridge.pojo.Product;


public class ProductDoa {
	public static boolean insertData(Product p) {
		try {
			@SuppressWarnings("unused")
			boolean f= false;
			Connection con = ConnectClass.CreateConnect();
			
			String query= "insert into product(pname,price,quantity) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getpName());
			ps.setInt(2, p.getPrice());
			ps.setInt(3, p.getQuantity());
			
			ps.executeUpdate();
			f=true;		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}
	public static boolean updateData(int val,int id,Product p) {
		Connection con = ConnectClass.CreateConnect();
		try {
			@SuppressWarnings("unused")
			boolean f= false;
		if(val==1) {
			//Update Name
			String query= "update product set pname=? where pid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getpName());
			ps.setInt(2, id);
			
			ps.executeUpdate();
			f=true;			
		}
		else if(val==2) {
			//Update Price
			String query= "update product set price=? where pid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p.getPrice());
			ps.setInt(2, id);
			ps.executeUpdate();
			f=true;	
			
		}
		else if(val==3) {
			//Update Quantity
			String query= "update product set quantity=? where pid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p.getQuantity());
			ps.setInt(2, id);
			ps.executeUpdate();
			f=true;	
			
		}
		else {
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		}
	
	public static boolean deleteData(int id) {
		Connection con = ConnectClass.CreateConnect();
		@SuppressWarnings("unused")
		boolean f=false;
		try {
			String query= "delete from product where pid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}
	public static void displayData() {
		Connection con = ConnectClass.CreateConnect();
		try {
			String query= "select * from product";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				int quantity = rs.getInt(4);
				System.out.println("Product Id:"+ id +"Product Name:"+ name + "Product Price:" + price + "Product quantity:" + quantity);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
