package org.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	User user=new User();
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		ses.beginTransaction();

		 ses.getTransaction().commit();
		 ses.close();
	String name= (String) "sadsa";
  Object User =Class.forName("org.user").newInstance();
	}

}
