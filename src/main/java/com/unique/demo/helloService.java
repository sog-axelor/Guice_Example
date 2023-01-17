package com.unique.demo;

import com.google.inject.ImplementedBy;

@ImplementedBy(helloImpl.class)
public interface helloService {
	String sayHello();
}
