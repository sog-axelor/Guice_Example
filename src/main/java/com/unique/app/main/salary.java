
package com.unique.app.main;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class salary{
	
private String name;
	
	@Inject
	public salary(@Named("Test") String name) {
		this.name = name;
	}
	 
	public void emp(){
		System.out.println(name);
	}
}