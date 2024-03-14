package com.edubridge.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.entity.Applicant;
import com.edubridge.entity.Passport;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Mapping One-to-One relationship");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Passport p = new Passport();
		Applicant a = new Applicant();
		
		a.setName("Abhirami");
		a.setAge(24);
		a.setCity("Ambernath");
		a.setPassport(p);
		
		p.setPassportNumber("hello123");
		p.setIssueDate(new Date());
		p.setExpiryDate(new Date());
		p.setApplicant(a);
		
		session.save(a);
		
		t.commit();
		
		session.close();
		System.out.println("Data stored successfully");
	}

}
