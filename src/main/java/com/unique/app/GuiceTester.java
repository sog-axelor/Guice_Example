package com.unique.app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class GuiceTester {

	public static void main(String[] args) {
		
		Injector ij = Guice.createInjector(new salaryModule());
		salary sl = ij.getInstance(salary.class);
		sl.emp();	
	}
}

//1.create class
class salary{
	private String name;
	
	@Inject
	public salary(@Named("Test") String name) {
		this.name = name;
	}
	 
	public void emp(){
		System.out.println(name);
	}
}

//2.create module

class salaryModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("Test")).toInstance("Hello akshay sir");
	}
}



