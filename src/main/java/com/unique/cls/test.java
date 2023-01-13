package com.unique.cls;

import com.google.inject.Inject;

public class test {

	private String Festival;
	
	@Inject
	public test(String Festival) {
		this.Festival = Festival;
	}
	
	public void testDemo()
	{
		System.out.println("Hello Akhsay SIr");
	}
}
