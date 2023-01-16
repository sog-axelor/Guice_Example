package com.unique.cls;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hello"})
public class hello extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public hello()
	{
		
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter out = res.getWriter();
		out.print("Hello world");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}
	
}
