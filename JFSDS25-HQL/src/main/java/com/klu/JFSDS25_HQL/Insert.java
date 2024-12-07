package com.klu.JFSDS25_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
			Query<R> q= s.createQuery("from Employee");
			list<employee>l = q.list();
			
			from(Employee x:l) {
				System.out.println(x.getEname());
			}
		emp.setEid(31263);
		emp.setEname("Sriram");
		emp.setEsal(12345);
		
		s.persist(emp);
		t.commit();
		
		s.close();
		sf.close();
		
	
		

	}

}
