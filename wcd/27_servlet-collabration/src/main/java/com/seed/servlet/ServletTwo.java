package com.seed.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	public void init() throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("servlet two");
		
		ServletContext context = getServletContext();
		Connection con =  (Connection) context.getAttribute("connection");
		System.out.println("connnection: "+con);
	}

}
