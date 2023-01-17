package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.unique.module.studentModule;
import com.unique.service.studentService;

public class Main {

	public static void main(String[] args) {
			Injector ij = Guice.createInjector(new studentModule(),new JpaPersistModule("jpaTest"));
			PersistService ps =  ij.getInstance(PersistService.class);
			ps.start();
			
			studentService ss = ij.getInstance(studentService.class);
			ss.Student("test1");			
			System.out.println("Added Successfully...");
			
	}

}
