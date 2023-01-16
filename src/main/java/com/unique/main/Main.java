package com.unique.main;

import javax.persistence.EntityManager;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.unique.module.studentModule;
import com.unique.service.studentService;

public class Main {
	@Inject EntityManager em;

	public static void main(String[] args) {
			Injector ij = Guice.createInjector(new studentModule());
			studentService ss = ij.getInstance(studentService.class);
			
			ss.Student("test");
			
			System.out.println("Added Successfully...");
			
	}

}
