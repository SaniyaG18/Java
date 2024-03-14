package com.edubridge.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionfactory;
	static{
		try {
			sessionfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Throwable e){
			System.out.println(e);
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}

}
