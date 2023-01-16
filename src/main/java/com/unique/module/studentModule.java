package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.impl.StudentImpl;
import com.unique.service.studentService;

public class studentModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(studentService.class).to(StudentImpl.class);
		
	}
	
}
