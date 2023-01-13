package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.unique.app.main.salary;
import com.unique.app.module.salaryModule;

public class GuiceTester {

	public static void main(String[] args) {
		
		Injector ij = Guice.createInjector(new salaryModule());
		salary sl = ij.getInstance(salary.class);
		sl.emp();	
	}
}




