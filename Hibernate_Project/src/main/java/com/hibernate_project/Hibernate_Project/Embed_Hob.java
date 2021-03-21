package com.hibernate_project.Hibernate_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embed_Hob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		
		Student_data st=new Student_data();
		st.setId(201);
		st.setCity("hoogly");
		st.setName("suparna ghosh");
		
		College clg=new College();
		clg.setClg_id(1608);
		clg.setClg_name("saroj mohan institute of technology");
		clg.setBranch("C.S.E");
		st.setClg(clg);
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(st);
		
		
		
		tx.commit();
		session.close();
		factory.close();
		

	}

}
