package com.edubridge.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.edubridge.databasedemo.ConnectionClassDemo;
import com.edubridge.pojo.Menu;


public class MenuDoa {

	public static boolean insertValues(Menu m) {
		
		Connection connect= ConnectionClassDemo.createConnect();
		@SuppressWarnings("unused")
		boolean f = false;
		try {
		String query = "insert into menu(name,price,quantity) values(?,?,?)";
		PreparedStatement ps = connect.prepareStatement(query);
		ps.setString(1, m.getName());
		ps.setInt(2, m.getPrice());
		ps.setString(3, m.getQuantity());
		ps.executeQuery(query);
		f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
				
	}
	
	public static boolean deleteValues(int id) {
		Connection connect= ConnectionClassDemo.createConnect();
		@SuppressWarnings("unused")
		boolean f = false;
		try {
			String query = "delete from menu where id = ?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.executeQuery(query);
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	public static boolean display() {
		Connection connect= ConnectionClassDemo.createConnect();
		@SuppressWarnings("unused")
		boolean f = false;
		try {
			String query = "select * from menu";
			Statement stmt = connect.createStatement();
			stmt.executeQuery(query);
			f=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
}
