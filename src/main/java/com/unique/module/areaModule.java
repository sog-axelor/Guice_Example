package com.unique.module;

import com.google.inject.AbstractModule;
import com.unique.app.Area;
import com.unique.app.ManualArea;

public class areaModule extends AbstractModule {
	@Override
	protected void configure()
	{
		bind(Area.class).annotatedWith(ManualArea.class).to(areaModule.class);
	}
}

