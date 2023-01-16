package com.unique.service;

import com.google.inject.ImplementedBy;
import com.unique.impl.guiceImpl;

@ImplementedBy(guiceImpl.class)
public interface HelloWorld {
	String sayHello();
}
