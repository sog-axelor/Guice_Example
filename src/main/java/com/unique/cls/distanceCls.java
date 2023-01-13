package com.unique.cls;

import com.google.inject.Inject;

public class distanceCls {

	private distance d;
	@Inject
	public distanceCls(distance d) {
		this.d = d;
	}
	public void makeDistance()
	{
		d.Map("Mumbai","Delhi",1800);
	}
}
