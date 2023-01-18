package com.unique.servlet;

import com.google.inject.ImplementedBy;

@ImplementedBy(helloImpl.class)
public interface helloInterface {
	String sayHello();
}
