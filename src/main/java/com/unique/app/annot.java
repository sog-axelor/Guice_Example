package com.unique.app;

import com.google.inject.Inject;

public class annot {
	private Area area;

	@Inject
	public annot(@defaultArea Area area) {
		this.area = area;

	}
	public void setAnotherArea() {
		System.out.println("Area Of Square : " + area.square(10));
	}

	public void setAnotherArea1() {
		System.out.println("Area Of Triangle : " + area.triangle(15, 12));
	}
}


