package com.unique.module;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.unique.cls.Logged;
import com.unique.interceptor.LoggingInterceptor;

public class LoggingModule extends AbstractModule {
	 @Override
	    protected void configure() {
	        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Logged.class),new LoggingInterceptor());
	    }
}