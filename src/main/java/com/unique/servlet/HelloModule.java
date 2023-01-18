package com.unique.servlet;

import com.google.inject.servlet.ServletModule;

public class HelloModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/hello").with(Hello.class);
	}
}
