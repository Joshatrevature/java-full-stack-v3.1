package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		
		System.out.println("Project Started...");
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Mark");
        employee.setEmail("m@gmail.com");
        
        session.save(employee);
        
        t.commit();
        
        session.close();
	}

}