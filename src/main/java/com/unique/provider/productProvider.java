package com.unique.provider;

import com.google.inject.Provider;
import com.unique.cls.product;
import com.unique.impl.productImpl;

public class productProvider implements Provider<product> {

	@Override
	public product get() {
		int a = 500;
		int b = 300;
		int x = 700;
		int y = 400;
		
		product p1 = new productImpl(a,b,x,y);
		return p1;
	}

}
