package com.hibernate_project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_data {
	
	public static void main(String args[]) {
		//get and load
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		//how get work(get gives null to hibernate session when there is no data belongs to this id);
		Student_data st=(Student_data)session.get(Student_data.class, 102);
		System.out.println(st.getCity());
		
		//how load work(it gives exception to hibernate session when there is no data belongs to this id);
		Address ad=(Address)session.load(Address.class, 1);
		System.out.println(ad);
		
		session.close();
		factory.close();
	}
	

}
