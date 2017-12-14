package manyToMany;

import java.io.IOException;

import manyToMany.Book;
import manyToMany.Ebook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import manyToMany.PBook;

public class Main {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Book book =  new Book();
		Ebook ebook = new Ebook();
		PBook pbook = new PBook();
		
	}

}
