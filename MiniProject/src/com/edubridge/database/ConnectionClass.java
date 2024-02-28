package com.edubridge.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	
	static Connection connect;
	
	public static Connection createConnet() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/miniproject";
		String username="root";
		String password="root";
		connect = DriverManager.getConnection(url,username,password);
		return connect;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connect;
	}

}
