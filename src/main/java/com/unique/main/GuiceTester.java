package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.app.ManualArea;
import com.unique.module.areaModule;

import com.google.inject.BindingAnnotation;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface TotalArea {}

public class GuiceTester {
	Injector ij = Guice.createInjector(new areaModule());
	ManualArea ma = ij.getInstance(ManualArea.class);


}


