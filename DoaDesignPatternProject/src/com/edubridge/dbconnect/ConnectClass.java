package com.edubridge.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectClass {
	
	static Connection con;
	
	
	@SuppressWarnings("unused")
	public static Connection CreateConnect() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","root");
				return con;		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	
		
	}

}
