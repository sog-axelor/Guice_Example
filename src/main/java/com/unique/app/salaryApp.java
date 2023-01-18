package com.unique.app;

import com.google.inject.Inject;
import com.unique.cls.salaryCount;
import com.unique.cls.salaryTracker;

public class salaryApp {

	private salaryCount sc;
	
	@Inject
	public salaryApp(salaryCount sc) {
		this.sc = sc;
	}
	
	@salaryTracker
	public void doSalary() {
		sc.gSalary(10000, 400, 300);
	}
}
