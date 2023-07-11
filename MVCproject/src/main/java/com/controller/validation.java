package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class validation extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) {
		try {
			String reggg=req.getParameter("reg");
			String passw=req.getParameter("password");
			
			if(reggg.length()!=4 || passw.length()==0) {
				res.sendRedirect("/MVCproject/Invalid.html");
			}
			else {
				req.getServletContext().getRequestDispatcher("/GetResults").forward(req,res);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
