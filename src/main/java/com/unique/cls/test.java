package com.unique.cls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.unique.service.HelloWorld;
@Singleton
public class test extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private HelloWorld helloWorld;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print(helloWorld.sayHello());
	}
}
