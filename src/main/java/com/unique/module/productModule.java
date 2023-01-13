package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.cls.product;
import com.unique.provider.productProvider;

public class productModule extends AbstractModule{

	@Override
	   protected void configure() {
		
		bind(product.class).toProvider(productProvider.class);
	}
}

