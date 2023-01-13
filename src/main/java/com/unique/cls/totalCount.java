package com.unique.cls;

import com.google.inject.Inject;

public class totalCount {

	private salaryCount sc;
	
	@Inject
	public totalCount(salaryCount sc) {
		this.sc = sc;
	}
	
	public void maketotalCount()
	{
		sc.gSalary(10000,400,300);
		sc.iSalary(10000);
	}
}
