package com.jtcindia.project;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

public class Lab17 {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("Nitin", "Nitin@gmail.com", 8999);
			session.save(cust);
			tx.commit();
			session.close();		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
