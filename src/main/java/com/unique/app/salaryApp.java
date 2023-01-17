package com.unique.app;

import com.google.inject.Inject;
import com.unique.cls.salaryCount;

public class salaryApp {

	private salaryCount sc;
	
	@Inject
	public salaryApp(salaryCount sc) {
		this.sc = sc;
	}
	public void doSalary() {
		sc.gSalary(10000, 400, 300);
	}
}
