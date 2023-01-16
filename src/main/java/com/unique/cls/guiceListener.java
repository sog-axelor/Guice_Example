package com.unique.cls;

import javax.servlet.annotation.WebListener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

@WebListener
public class guiceListener extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
	    return Guice.createInjector(new ServletModule(){
	    	@Override
	    	protected void configureServlets(){
	    		serve("/*").with(test.class);
	    	}
	    });
	    
	}

}
