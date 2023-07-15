package app;



import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Questions;
import entities.Subject;





public class Subject_que {
	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session=sf.openSession();
		

		Subject s1=new Subject(1, "Java", "questions is about java" ,"Who invented JAVA?");
		Transaction tr =session.beginTransaction();
		
		session.save();
		
		tr.commit();
		
		session.close();
		
		sf.close();
		
		
	}
}
