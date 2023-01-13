package com.unique.impl;


public class averageImpl extends marksImpl{
	
	@Override
	public int subject(int mark1, int mark2, int mark3) {
		int Average_marks = (mark1+mark2+mark3)/3;
		return Average_marks;
	}
}
