package com.jtcindia.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Lab7A {

	public static void main(String[] args) {
		
		Transaction tx = null;
		Session session = null;

		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer();
			System.out.println("Here we have the customer details " + session.save(cust));
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-- Complete --");
		}

	}


	}
}
