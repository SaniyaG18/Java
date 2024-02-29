package com.edubridge.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClassDemo {
	
	static Connection connect;
	
	public static Connection createConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hotel";
			String username = "root";
			String password = "root";
			
			connect = DriverManager.getConnection(url,username,password);
			
			return connect;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connect;
		
	}
	

}
