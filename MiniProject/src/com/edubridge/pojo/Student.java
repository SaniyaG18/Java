package com.edubridge.pojo;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentPhoneNo;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}
	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//topString method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentPhoneNo=" + studentPhoneNo + "]";
	}
	
	//Parameterized constructor
	public Student(String studentName, String studentCity, String studentPhoneNo) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPhoneNo = studentPhoneNo;
	}
	
}
