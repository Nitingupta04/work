package com.jtcindia.project;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static SessionFactory sessionFactory;
	static {

		Configuration cfg = new Configuration();
		Properties myprops = new Properties();

		myprops.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		myprops.put(Environment.URL, "jdbc:mysql://localhost:3306/lab17");
		myprops.put(Environment.USER, "root");
		myprops.put(Environment.PASS, "System@123");
		myprops.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		myprops.put(Environment.SHOW_SQL, "true");
		myprops.put(Environment.POOL_SIZE, "99");
		myprops.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		myprops.put(Environment.HBM2DDL_AUTO, "create");

		cfg.setProperties(myprops);
		cfg.addAnnotatedClass(Customer.class);
		StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder();
		ServiceRegistry sr = ssr.applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(sr);

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
