package com.unique.cls;

import com.google.inject.Inject;

public class defaultProduct {
	
	private product product;
	@Inject
	public defaultProduct(product product) {
		this.product = product;
	}
	
	public void makeProduct()
	{
		product.AddProduct(800, 700);
		product.RemoveProduct(800, 300);
	}
}
