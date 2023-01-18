package com.unique.listner;


import javax.servlet.annotation.WebListener;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.unique.Module.helloModule;

@WebListener
public class HelloListner extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new helloModule());
	}

}
