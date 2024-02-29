package com.edubridge.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.edubridge.database.ConnectionClass;
import com.edubridge.pojo.Student;
public class StudentDoa {
	public static boolean insertStudentData(Student s) {
		try {
			@SuppressWarnings("unused")
			boolean f= false;
			Connection connect = ConnectionClass.createConnet();
			
			String query= "insert into student(sname,scity,phoneno) values(?,?,?)";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setString(1, s.getStudentName());
			ps.setString(2, s.getStudentCity());
			ps.setString(3, s.getStudentPhoneNo());
			
			ps.executeUpdate();
			f=true;		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}
	public static boolean updateStudentData(int val,String toUpdate,int id,Student s) {
		Connection connect = ConnectionClass.createConnet();
		try {
			@SuppressWarnings("unused")
			boolean f= false;
		if(val==1) {
			//Update Name
			String query= "update student set sname=? where sid=?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setString(1, toUpdate);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			f=true;			
		}
		else if(val==2) {
			//Update Phone Number
			String query= "update student set phoneno=? where sid=?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setString(1, toUpdate);
			ps.setInt(2, id);
			ps.executeUpdate();
			f=true;	
			
		}
		else if(val==3) {
			//Update City
			String query= "update student set scity=? where sid=?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setString(1, toUpdate);
			ps.setInt(2, id);
			ps.executeUpdate();
			f=true;	
			
		}
		else {
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		}
	
	public static boolean deleteStudentData(int id) {
		Connection connect = ConnectionClass.createConnet();
		@SuppressWarnings("unused")
		boolean f=false;
		try {
			String query= "delete from student where sid=?";
			PreparedStatement ps = connect.prepareStatement(query);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}
	public static void displayStudentData() {
		Connection connect = ConnectionClass.createConnet();
		try {
			String query= "select * from student";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				String phoneno = rs.getString(4);
				System.out.println("Student Id:"+ id +"Student Name:"+ name + "Student City:" + 					city + "Student Phone No.:" + phoneno);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	

}
