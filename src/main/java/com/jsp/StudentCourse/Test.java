package com.jsp.StudentCourse;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory eMFactory = Persistence.createEntityManagerFactory("aniket");
		EntityManager eManager = eMFactory.createEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		
		List<Course> courses = new ArrayList();
		Student student = new Student();
		student.setName("nihal");
		student.setEmail("nihal@gmail.com");
		
		Course course1 = new Course();
		course1.setName("web dev");
		course1.setDuration(2);
		
		Course course2 = new Course();
		course2.setName("soft dev");
		course2.setDuration(3);
		
		Course course3 = new Course();
		course3.setName("AWS");
		course3.setDuration(2);
		
		
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
	
		
		course1.setStudent(student);
		course2.setStudent(student);
		course3.setStudent(student);
	
		student.setCourse(courses);
		
		eTransaction.begin();
		eManager.persist(course1);
		eManager.persist(course2);
		eManager.persist(course3);
		eManager.persist(student);
		eTransaction.commit();
		
		System.out.println("all good");
	}

}
