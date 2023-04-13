package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Departmnet;
import model.Student;

public class Test {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Departmnet d = new Departmnet();
		d.setId(1);
		d.setDepName("hello");
		d.setDepAddress("Indore");

		Transaction t = session.beginTransaction();
		session.save(d);
		t.commit();

		System.out.println("Saved");
		// System.out.println(listUsers(session));

	}

}
