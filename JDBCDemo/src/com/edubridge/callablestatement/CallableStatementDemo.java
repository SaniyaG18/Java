package com.edubridge.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/feb28";
		String uname = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,uname,password);
		String query =  "insert into user(uid,uname,age) values(?,?,?)";
		
		CallableStatement cs = con.prepareCall(query);
		cs.setInt(1, 103);
		cs.setString(2,"Divya");
		cs.setInt(3, 25);
		cs.execute();
		System.out.println("Done");
	}

}
