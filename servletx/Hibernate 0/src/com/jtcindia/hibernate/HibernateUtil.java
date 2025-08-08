package com.jtcindia.hibernate;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionFactory = null;
	static {
		try {
			Configuration cfg = new Configuration();
			Properties myprops = new Properties();
			myprops.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/custdb");
			myprops.put(Environment.USER, "root");
			myprops.put(Environment.PASS, "System@123");
			myprops.put(Environment.POOL_SIZE, "99");
			myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			myprops.put(Environment.SHOW_SQL, "true");
			myprops.put(Environment.HBM2DDL_AUTO, "update");
			cfg.setProperties(myprops);
			cfg.addAnnotatedClass(Customer.class);
			StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder();
			ServiceRegistry sr = ssr.applySettings(cfg.getProperties()).build(); //doubt
			sessionFactory = cfg.buildSessionFactory(sr);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
