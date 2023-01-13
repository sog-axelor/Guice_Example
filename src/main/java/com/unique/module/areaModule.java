package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.app.Area;
import com.unique.app.defaultArea;
import com.unique.impl.areaofSquareImpl;

public class areaModule  extends AbstractModule{
	@Override
	protected void configure()
	{
		bind(Area.class).annotatedWith(defaultArea.class).to(areaofSquareImpl.class);
	}
}

