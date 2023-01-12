package com.unique.app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class GuiceTester {

	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new marksModule());
		StudentMarks sm = ij.getInstance(StudentMarks.class);
		sm.result();
	}
}


//1.create simple Interface
interface marks{
	int subject(int mark1,int mark2,int mark3);
}


//2.create implmentation method
class marksImpl implements marks{

	@Override
	public int subject(int mark1, int mark2, int mark3) {
		int total_marks = mark1+mark2+mark3;
		return total_marks;
	}	
}

//3.create another implement method
class averageImpl extends marksImpl{
	
	@Override
	public int subject(int mark1, int mark2, int mark3) {
		int Average_marks = (mark1+mark2+mark3)/3;
		return Average_marks;
	}
}
//4.create another class named Bindings
class StudentMarks{
	private marks mark;
	
	@Inject
	public StudentMarks(@Named("StudentScore") marks mark) {
		this.mark = mark;
	}
	
	public void result() {
		int total = mark.subject(75,78,72);
		System.out.println("marks are : " + total);
	}
}


//5.create Module
class marksModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(marks.class).annotatedWith(Names.named("StudentScore")).to(averageImpl.class);
	}
}






























