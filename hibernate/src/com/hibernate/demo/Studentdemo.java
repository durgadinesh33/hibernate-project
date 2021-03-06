package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.demo.entity.Student;

public class Studentdemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		 
		try {
			System.out.println("creating new student object..");
			Student tempStudent = new Student("lucy","jason","dolly@json.com",2);
			session.beginTransaction();
			System.out.println("saving the student...");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("done..");
			
		}
		finally {
			factory.close();
		}
		

	}

}
