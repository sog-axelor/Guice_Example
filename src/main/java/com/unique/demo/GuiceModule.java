package com.unique.demo;

import com.google.inject.servlet.ServletModule;

public class GuiceModule extends ServletModule {

	@Override
	protected void configureServlets() {
		serve("/ws").with(MyServlet.class);
	}
	
	
}
