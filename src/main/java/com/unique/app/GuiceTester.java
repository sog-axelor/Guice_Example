package com.unique.app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
//4.create a main method for call
	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new SimpleInterestModule());
		SimpleInterest si = injector.getInstance(SimpleInterest.class);
		int p = 1000;
		int r = 4;
		int n = 3;
		int s = si.simpleInterest(p, r, n);
		int s1 = si.amount(s,p);
		System.out.println("Simple Interest is : " + s);
		System.out.println("Amount is : " + s1);

	}
}

//1.create Interface
		interface SimpleInterest {
			int simpleInterest(int p,int r,int n);
			int amount(int si, int p);
		}

		
//2.implements for simpleinterest
	class SimpleInterestImpl implements SimpleInterest {
			@Override
			public int simpleInterest(int p, int r, int n) {	
				int si = p*r*n/100;
			return si;
		}

			
			public int amount(int si, int p) {
				return 0;
			}

	}
	
//3.implement for amount for get amount 
		 class Amountimpl extends SimpleInterestImpl{
			 
				@Override
				public int amount(int si, int p) {	
				int amount = si + p;
				
				return amount; 		 
			}
	}
		

// 4.Binding Module
		 class SimpleInterestModule extends AbstractModule {
		
			@Override
			protected void configure() {
				bind(SimpleInterest.class).to(SimpleInterestImpl.class);
				bind(SimpleInterestImpl.class).to(Amountimpl.class);
			}
		}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
