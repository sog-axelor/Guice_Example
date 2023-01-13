package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.distanceCls;
import com.unique.module.distanceModule;

public class Main {

	public static void main(String[] args) {
	      Injector ij = Guice.createInjector(new distanceModule());
	      distanceCls d  =ij.getInstance(distanceCls.class);
	      d.makeDistance();
	}

}
