package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.defaultProduct;
import com.unique.module.productModule;

public class Main {

	public static void main(String[] args) {
	      Injector ij = Guice.createInjector(new productModule());
	      defaultProduct dp = ij.getInstance(defaultProduct.class);
	      dp.makeProduct();
	}
	

}
