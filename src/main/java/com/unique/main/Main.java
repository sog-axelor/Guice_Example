package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.app.salaryApp;
import com.unique.module.salaryModule;

public class Main {

	public static void main(String[] args) {

		Injector ij = Guice.createInjector(new salaryModule());
		salaryApp sa = ij.getInstance(salaryApp.class);
		System.out.println("Salary is here");
		sa.doSalary();
	}

}
