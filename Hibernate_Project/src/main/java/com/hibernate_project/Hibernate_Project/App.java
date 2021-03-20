package com.hibernate_project.Hibernate_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {	System.out.println( "project start..." );
     
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sesfact=cfg.buildSessionFactory();
        
        //creating student ;
        
        Student_data std=new Student_data();
        std.setId(102);
        std.setCity("Kolkata");
        std.setName("Supriya Ghosh");
        
        //creating address;
        Address adt=new Address();
        adt.setStreet("Mahavir colony beur more anisabad patna-2");
        adt.setCity("Patna");
        adt.setOpen(true);
        adt.setAdded_date(new Date());
        adt.setX(123.34);
        
        //uploading image on database;
        FileInputStream fl=new FileInputStream("src/main/java/IMG-20200514-WA0017.jpg");
        byte[] data=new byte[fl.available()];
        fl.read(data);
        adt.setImage(data);
        
        Session sess=sesfact.openSession();
        
        Transaction txt=sess.beginTransaction();
        sess.save(std);
        sess.save(adt);
        txt.commit();
        
        sess.close();
        System.out.println(std);
        System.out.println(adt);
        
      
    }
}
