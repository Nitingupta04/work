package com.jtc.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionfactory;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg = cfg.configure("Hibernate.cfg.xml");
			sessionfactory = cfg.buildSessionFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}

}
