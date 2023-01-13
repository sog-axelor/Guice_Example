package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.test;
import com.unique.module.testModule;

public class Main {

	public static void main(String[] args) {
	      Injector ij = Guice.createInjector(new testModule());
	      test t = ij.getInstance(test.class);
	      t.testDemo();

	}

}
