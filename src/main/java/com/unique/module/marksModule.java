package com.unique.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.unique.cls.marks;
import com.unique.impl.averageImpl;


public class marksModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(marks.class).annotatedWith(Names.named("StudentScore")).to(averageImpl.class);
	}
}