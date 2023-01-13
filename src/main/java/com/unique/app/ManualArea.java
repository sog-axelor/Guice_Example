package com.unique.app;
import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;

import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface TotalArea {}

public class ManualArea {
	private Area area;
	
	@Inject
	public ManualArea(@TotalArea Area area) {
		this.area = area;
		
	}
	public void setAnotherArea() {
		System.out.println("Area Of Square : " + area.square(10));
	}
	
	public void setAnotherArea1() {
		System.out.println("Area Of Triangle : " + area.triangle(15, 12));
	}
}
