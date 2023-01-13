package com.unique.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.unique.cls.distance;
import com.unique.impl.distanceImpl;

public class distanceModule extends AbstractModule{
	

	   @Override
	   protected void configure() {
		   try {
			bind(distance.class).toConstructor(distanceImpl.class.getConstructor(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		   bind(String.class).annotatedWith(Names.named("Journey")).toInstance("Mumbai To Delhi have Distance 1800kM");
	   }
}
