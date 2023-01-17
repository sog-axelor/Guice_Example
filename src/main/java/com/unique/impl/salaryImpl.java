package com.unique.impl;

import com.unique.cls.salaryCount;

public class salaryImpl implements salaryCount {

	@Override
	public void gSalary(int s, int p, int e) {
		int salary = s - (p + e);
		System.out.println("The Intial salary is  : " + s);
		System.out.println("The Gross salary is  : " + salary);
	}

}
