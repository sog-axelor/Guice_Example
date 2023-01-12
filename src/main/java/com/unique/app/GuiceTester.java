package com.unique.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface TotalArea {}

public class GuiceTester {

	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new areaModule());
		DefaultArea a = ij.getInstance(DefaultArea.class);
		a.setAnotherArea();
		a.setAnotherArea1();
		
	}
}

//1. create an interface
interface Area{
	int triangle(int h,int b);
	int square(int l);
}

//2.triangle implements using Area
class AreaofTriangleImpl implements Area{

	@Override
	public int triangle(int h, int b) {
		int area = h*b/2;
		return area;
	}

	@Override
	public int square(int l) {
		return 0;
	}
}


//2.Square implements using Area
class areaofSquareImpl extends AreaofTriangleImpl{
	@Override
	public int square(int l) {
		return l*l;
	}
}


//5.add annotation bindings
class DefaultArea{
	private Area area;
	
	@Inject
	public DefaultArea(@TotalArea Area area) {
		this.area = area;
		
	}
	public void setAnotherArea() {
		System.out.println("Area Of Square : " + area.square(10));
	}
	
	public void setAnotherArea1() {
		System.out.println("Area Of Triangle : " + area.triangle(15, 12));
	}
	
	
}



//6.add module
class areaModule extends AbstractModule{
	@Override
	protected void configure()
	{
		bind(Area.class).annotatedWith(TotalArea.class).to(areaofSquareImpl.class);

	}
}
































