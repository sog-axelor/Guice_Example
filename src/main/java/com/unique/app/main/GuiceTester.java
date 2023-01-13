package com.unique.app.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.app.cls.SimpleInterest;
import com.unique.app.myModule.SimpleInterestModule;

public class GuiceTester {
//4.create a main method for call
	public static void main(String[] args) {

		Injector ij = Guice.createInjector(new SimpleInterestModule());
		SimpleInterest si = ij.getInstance(SimpleInterest.class);
		int p = 1000;
		int r = 4;
		int n = 3;
		int s = si.simpleInterest(p, r, n);
		int s1 = si.amount(s,p);
		System.out.println("Simple Interest is : " + s);
		System.out.println("Amount is : " + s1);
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
