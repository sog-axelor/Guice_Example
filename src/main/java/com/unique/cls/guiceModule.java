package com.unique.cls;

import com.google.inject.servlet.ServletModule;

public class guiceModule extends ServletModule{

    @Override
    protected void configureServlets() {
      serve("/*").with(test.class);
    }
}
