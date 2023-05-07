package com.jetbreed.hibernate_evaluation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Courses courses = new Courses();
    	courses.setCourse_id(101);
    	courses.setCourseName("Hibernate Programming");
    	
    	
    	Configuration con = new Configuration().configure()
    			.addAnnotatedClass(Courses.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder()
    			.applySettings(con.getProperties())
    			.buildServiceRegistry();
    	
    	SessionFactory sf =  con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction trans = session.beginTransaction();
    	
    	trans.commit();
    	
//    	session.getTransaction().commit();
    }
}
