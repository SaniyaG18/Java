package com.edubridge.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	static Connection connect;
	
	
	@SuppressWarnings("unused")
	public static Connection CreateConnect() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprohject2","root","root");
						
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connect;
	
		
	}

}
