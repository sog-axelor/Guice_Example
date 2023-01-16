package com.unique.listner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class StudentListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return null;
   // TODO document why this method is empty
 }

}
