package com.unique.Module;

import com.google.inject.servlet.ServletModule;
import com.unique.servlet.Hello;

public class helloModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/hello").with(Hello.class);
	}

}
