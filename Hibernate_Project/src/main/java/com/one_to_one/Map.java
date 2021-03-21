package com.one_to_one;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating question
		Question q1=new Question();
		q1.setQuestion_id(101);
		q1.setQuest("what is java");
		
		Question q2=new Question();
		q2.setQuestion_id(102);
		q2.setQuest("what is oops concept");
		
		
		//creating answer
		Answer a1=new Answer();
		a1.setAnswer_id(201);
		a1.setAnswers("Java is programming language follow oops concept");
		q1.setAnswer(a1);
		
		Answer a2=new Answer();
		a2.setAnswer_id(202);
		a2.setAnswers("OOP concepts in Java are the main ideas behind Java’s Object Oriented Programming. They are an abstraction, encapsulation, inheritance, and polymorphism.");
		q2.setAnswer(a2);
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
