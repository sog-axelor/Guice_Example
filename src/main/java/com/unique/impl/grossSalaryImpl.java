package com.unique.impl;

import com.google.inject.Inject;
import com.unique.cls.salaryCount;

public class grossSalaryImpl implements salaryCount{
	private int s;
	private int p;
	private int e;
	
	@Inject
	public grossSalaryImpl(int s, int p, int e) {
		this.s = s;
		this.p = p;
		this.e = e;
	}
	
	@Override
	public void iSalary(int s) {
		System.out.println("Your Intiall Salary : " + s);
		System.out.println("Your PF Allowance : " + p);
		System.out.println("Your Esic : " + e);

	}

	@Override
	public void gSalary(int s, int p, int e) {
		int gs = s - (p + e);
		System.out.println("Your Total Salary is : " + gs);
	}
}
