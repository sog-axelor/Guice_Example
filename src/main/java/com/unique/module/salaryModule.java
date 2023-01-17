package com.unique.module;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.unique.cls.salaryCount;
import com.unique.cls.salaryTracker;
import com.unique.impl.salaryImpl;
import com.unique.interceptor.salaryIntreceptor;

public class salaryModule extends AbstractModule {
	@Override
	   protected void configure() {
		bind(salaryCount.class).to(salaryImpl.class);
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(salaryTracker.class),new salaryIntreceptor());
	}
}
