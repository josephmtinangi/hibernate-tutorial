package com.jmtinangi.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("STARTING");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = new Student();
		student.setName("Joseph Mtinangi");
		student.setRoll("101");
		student.setPhone("+255719961077");
		student.setDegree("BSc. SE");

		Transaction tx = session.beginTransaction();
		session.save(student);
		System.out.println("Object saved successfully");
		tx.commit();
		session.close();
		factory.close();
	}

}
