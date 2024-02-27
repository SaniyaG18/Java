package com.edubridge.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 1 load the jdbc driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 connection
		
		String url = "jdbc:mysql://localhost:3306/Management";
		String username="root";
		String password = "root";
		
		//Step 3 call driver manager
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println("Collect data from employee table :");
		
		Statement stmt = con.createStatement();
		
		String sql = "select * from employee";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("eid");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			System.out.println("Employee Id :" + id + " Employee Name :" + name + " Employee age :"+ age);
			
		}

	}

}
