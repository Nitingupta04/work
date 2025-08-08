package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {

	public static void main(String[] args) {
		
		// 1 Creating the Transaction obj		
		Transaction tx = null;
		
		try {	
			// 2 Creating the SessionFactory Obj
			SessionFactory sf = HibernateUtil.getSessionfactory();
			
			//3 Creating the Session Obj
			Session session = sf.openSession();
			
			//4 Begaing the Transaction
			tx = session.beginTransaction();
			
			
			//5 Entering the customer data
			Customer cust = new Customer("Nitin", "Nitin@gmail.com", 79992389, "Damoh", 10000);
			
			//6 Saving the session 
			session.save(cust);
			
			//7 Commit()
			tx.commit();
			
			//8 Close the session
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
