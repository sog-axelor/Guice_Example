package com.unique.impl;



import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.unique.app.StudentDetail;
import com.unique.service.studentService;
public class StudentImpl implements studentService {

	@Inject
	private EntityManager em;
	
	@Override
	public void Student(String name) {

		StudentDetail sd=  new StudentDetail();
		sd.setName(name);
		em.persist(sd);
	}

}
