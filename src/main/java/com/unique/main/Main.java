package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.app.annot;
import com.unique.module.areaModule;

public class Main {
	public static void main(String[] args) {
		
		Injector ij = Guice.createInjector(new areaModule());
		annot a1 = ij.getInstance(annot.class);
		a1.setAnotherArea();
		a1.setAnotherArea1();
		
	}
}

