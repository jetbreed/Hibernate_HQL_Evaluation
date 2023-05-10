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
    	
    	Student student = new Student();
    	student.setID(101);
    	student.setRegNumber(11101);;
    	student.setFirstName("Cahrles");
    	student.setLastName("Pricey");
    	student.setMiddleName("Trust");
    	student.setPhoneNumber("+234-806-35335553");
    	student.setGender("Male");
    	student.setAge("36");
    	student.setEmail("charles@gmail.com");
    	
    	Address address = new Address();
    	address.setAddressOne("#4 Mortality Road, D-line");
    	address.setAddressTwo("Port-Harcourt, Rivers State, Nigeria");
    	address.setLGA("Obio-Akpor");
    	address.setStateOfOrigin("Rivers State");
    	address.setZipCode("500102");
    	address.setNationality("Nigeria");
    	
    	student.setAddress(address);
    	
    	Configuration con = new Configuration().configure()
    			.addAnnotatedClass(Courses.class)
    			.addAnnotatedClass(Student.class);
    	    	
    	ServiceRegistry reg = new ServiceRegistryBuilder()
    			.applySettings(con.getProperties())
    			.buildServiceRegistry();
    	
    	SessionFactory sf =  con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction trans = session.beginTransaction();
    	
//    	student = (Student)session.get(Student.class, 101);
    	
    	session.save(courses);
    	session.save(student);
//    	session.update(student);
    	
    	trans.commit();
    	
//    	session.getTransaction().commit();
    }
}
