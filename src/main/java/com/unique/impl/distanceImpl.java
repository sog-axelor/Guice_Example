package com.unique.impl;

import com.google.inject.name.Named;
import com.unique.cls.distance;

public class distanceImpl implements distance{
	
	private String TotalDistance;
	public distanceImpl(){}
	
	public distanceImpl(@Named("Journey") String TotalDistance){
		this.TotalDistance = TotalDistance;
	}

	
	@Override
	public void Map(String d1, String d2, int d) {
		
		System.out.println("the to Distance is : " + d1);
		System.out.println("the From Distance is : " + d2);
		System.out.println("the Total Distance is : " + d);

	}

}
