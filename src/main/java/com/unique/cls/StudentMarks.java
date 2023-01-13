package com.unique.cls;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class StudentMarks{
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
