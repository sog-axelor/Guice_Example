package com.unique.impl;

import com.unique.cls.marks;

public class marksImpl implements marks {
	
	@Override
	public int subject(int mark1, int mark2, int mark3) {
		int total_marks = mark1+mark2+mark3;
		return total_marks;
	}	
}
