package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.totalCount;
import com.unique.module.salaryModule;

public class GuiceTester {

	public static void main(String[] args) {

		Injector ij = Guice.createInjector(new salaryModule());
		totalCount tc = ij.getInstance(totalCount.class);
		tc.maketotalCount();
	}

}
