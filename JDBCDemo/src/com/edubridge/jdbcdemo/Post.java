package com.edubridge.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Post {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Management";
		String username="root";
		String password = "root";
		Connection connect = DriverManager.getConnection(url,username,password);
		Statement stmt = connect.createStatement();
		
		String sqlq = "select * from post";
		//String sql = "insert into post values(105,'soak','poor')";
		
		//int rs2 = stmt.executeUpdate(sql);
		//delete
		String sql2 = "delete from post where pid = 105";
		stmt.execute(sql2);
		
		//update
		String sql3 = "update post set comments='fail' where pid = 104";
		stmt.execute(sql3);
		ResultSet rs1 = stmt.executeQuery(sqlq);
		
		while(rs1.next()) {
			int id = rs1.getInt("pid");
			String name = rs1.getString("pname");
			String comment = rs1.getString("comments");
			System.out.println("Post Id:"+id+" Post Name:"+name+" Post Comment:"+comment);
		}

	}

}
