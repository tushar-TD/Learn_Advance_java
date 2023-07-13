package app;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Order;
import entities.Orderitem;



public class Order_Item {

	public static void main(String [] args)
	{
		//service
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		//read the info hibernate.cfg.xml file
		Metadata metadate=new MetadataSources(registry).getMetadataBuilder().build();
	
		//actually conn to database
		SessionFactory sf=metadate.getSessionFactoryBuilder().build();
	
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		Orderitem oi1=new Orderitem(5,1);
		Orderitem oi2=new Orderitem(6,1);
		
		Set<Orderitem> item=new HashSet();
		item.add(oi1);
		item.add(oi2);
		
		Order o2=new Order("first");
		o2.setItem(item);
		
		Transaction tr1=session.beginTransaction();
		session.save(o2);
		tr1.commit();
		session.close();
		sf.close();
		
	}
	
}
