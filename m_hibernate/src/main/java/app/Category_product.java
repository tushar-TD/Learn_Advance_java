package app;



import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Category;
import entities.Product;





public class Category_product {
	public static void main(String[] args) {
//		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().build();
//		Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
//		SessionFactory sf=metadata.getSessionFactoryBuilder().build();
		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session=sf.openSession();
		
		//master is saved separately
//		Transaction tr =session.beginTransaction();
//		Category cat=new Category("chocklate","sweet,tasty");
//		session.save(cat);
//		tr.commit();
//		System.out.println("Updated");
//		session.close();
//		sf.close();
		
		
		//child is saved separately for existing master
//		Transaction tr =session.beginTransaction();
//		Product p1 = new Product("KissME",1f, session.get(Category.class, 1));
//		session.save(p1);
//		tr.commit();
//		System.out.println("Updated");
//		session.close();
//		sf.close();
		
		
		Product p3 = new Product("pen",70f);
		Product p4 = new Product("notebook",185f);
		Set<Product> products = new HashSet();
		products.add(p3);
		products.add(p4);
		
		Category cat2 = new Category("Stationary","books ,notebooks");
		cat2.setProducts(products);
		
		Transaction tr =session.beginTransaction();
		
		session.save(cat2);
		
		tr.commit();
		
		session.close();
		
		sf.close();
		
		
	}
}
