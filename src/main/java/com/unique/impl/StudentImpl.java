package com.unique.impl;



import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import com.unique.app.StudentDetail;
import com.unique.service.studentService;
public class StudentImpl implements studentService {

	@Inject
	private Provider<EntityManager>  em;
	
	@Override
	@Transactional
	public void Student(String name) {

		StudentDetail sd=  new StudentDetail();
		sd.setName(name);
		
		System.out.println("Is transition is active ? " + em.get().getTransaction().isActive());
		em.get().persist(sd);
		System.out.println("Your name is : " + sd.getId());
	}

}
