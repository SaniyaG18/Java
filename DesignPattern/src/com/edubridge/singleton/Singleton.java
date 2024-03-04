package com.edubridge.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Singleton {
	
	private static Singleton jdbc;
	private Singleton() {}
	@SuppressWarnings("unused")
	public static Singleton getInstance() {
		if(jdbc==null) {
			jdbc=new Singleton();
		}
		return jdbc;
		}
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton","root","root");
				return conn;
		
	}
	
	@SuppressWarnings("static-access")
	public int insert(String uname,String passwd,int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCount = 0;
		try {
			c=this.getConnection();
			String Query = "insert into employee(empid,eusername,epassword) values(?,?,?)";
			ps = c.prepareStatement(Query);
			ps.setInt(1, id);
			ps.setString(2,uname);
			ps.setString(3, passwd);
			recordCount=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}	
		}
		return recordCount;
	}
	
	@SuppressWarnings("static-access")
	public int View() throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			c=this.getConnection();
			String Query = "select * from employee";
			ps = c.prepareStatement(Query);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}	
			if(rs!=null) {
				rs.close();
			}
		}
		return 0;
		
	}
	
	@SuppressWarnings("static-access")
	public int update(String passwd,int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCount = 0;
		try {
			c=this.getConnection();
			String Query = "update employee set epassword=? where empid=?";
			ps = c.prepareStatement(Query);
			ps.setString(1, passwd);
			ps.setInt(2, id);
			recordCount=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}	
		}
		return recordCount;
	}
	
	@SuppressWarnings("static-access")
	public int delete(int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCount = 0;
		try {
			c=this.getConnection();
			String Query = "delete from employee where eid=?";
			ps = c.prepareStatement(Query);
			ps.setInt(1, id);
			recordCount=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}	
		}
		return recordCount;
	}
	

}
