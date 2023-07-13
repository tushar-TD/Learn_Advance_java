package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.EmpAsg;
import entities.PermanentEmp;
import entities.Temp_emp;

public class EmpAsgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
	
		SessionFactory sf=metadata.getSessionFactoryBuilder().build();
		
		Session session = sf.openSession();
		
		EmpAsg e=new EmpAsg(201, "Tushar D","tushardhanorkar@gmail" , "7350396987", 90000);
		
		EmpAsg e1=new PermanentEmp(202,10000,1000, 2000, 3000);
		
		EmpAsg e2=new Temp_emp(203, 20000, 3000);
		
		Transaction tr =session.beginTransaction();
		
		session.save(e);
		session.save(e1);
		session.save(e2);
		
		tr.commit();
		
		System.out.println("Emps saved");

		session.close();
				
		sf.close();	
		
	}

}
