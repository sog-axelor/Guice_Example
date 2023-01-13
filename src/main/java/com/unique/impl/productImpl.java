package com.unique.impl;

import com.google.inject.Inject;
import com.unique.cls.product;

public class productImpl implements product{
	
	private int a,b,x,y;
	
	@Inject
	public productImpl(int x,int y,int a, int b)
	{
		this.x = x;
		this.y= y;
		this.a = a;
		this.b = b;
	}

	@Override
	public void AddProduct(int a, int b) {
		int add = a + b;
		System.out.println("Addition of  Product : " + add);
	}

	@Override
	public void RemoveProduct(int x, int y) {		
		int sub = x -y;
		System.out.println("Removal of  Product : " + sub);
	}

}
