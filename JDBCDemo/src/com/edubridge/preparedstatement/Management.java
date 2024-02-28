package com.edubridge.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Management {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/feb28";
		String uname = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,uname,password);
		
		String query =  "insert into user(uid,uname,age) values(?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, 102);
		ps.setString(2, "Sanu");
		ps.setInt(3,23);
		
		ps.executeUpdate();
		System.out.println("Done");

	}

}
