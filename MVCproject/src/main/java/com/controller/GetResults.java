package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResults extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		String reggg=req.getParameter("reg");
		String passw=req.getParameter("password");
	}
}
