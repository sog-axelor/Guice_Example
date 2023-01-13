package com.unique.impl;

import com.unique.app.Area;

public class AreaofTriangleImpl implements Area{
	@Override
	public int triangle(int h, int b) {
		int area = h*b/2;
		return area;
	}

	@Override
	public int square(int l) {
		return 0;
	}

}
