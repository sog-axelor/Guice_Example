package com.unique.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.unique.cls.salaryCount;
import com.unique.impl.grossSalaryImpl;

public class salaryModule extends AbstractModule {

	   @Override
	   protected void configure() {} 
	   
	   @Provides
	   public salaryCount mainSalaryCount()
	   {
		   salaryCount sc = new grossSalaryImpl(10000,400,300);
		   return sc;
	   }
	   
	  
	
}
