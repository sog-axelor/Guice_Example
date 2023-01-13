package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.StudentMarks;
import com.unique.module.marksModule;

public class GuiceTester {

	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new marksModule());
		StudentMarks sm = ij.getInstance(StudentMarks.class);
		sm.result();
	}
}






























