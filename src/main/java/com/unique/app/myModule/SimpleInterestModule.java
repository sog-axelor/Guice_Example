package com.unique.app.myModule;

import com.google.inject.AbstractModule;
import com.unique.app.cls.SimpleInterest;
import com.unique.app.impl.Amountimpl;
import com.unique.app.impl.SimpleInterestImpl;

public class SimpleInterestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SimpleInterest.class).to(SimpleInterestImpl.class);
		bind(SimpleInterestImpl.class).to(Amountimpl.class);
	}

}
