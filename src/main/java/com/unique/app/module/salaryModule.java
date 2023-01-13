
package com.unique.app.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class salaryModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("Test")).toInstance("Hello akshay sir");
	}
}