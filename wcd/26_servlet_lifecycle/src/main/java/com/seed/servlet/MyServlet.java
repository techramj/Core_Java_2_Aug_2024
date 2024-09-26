package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {

		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		
		
		String a = config.getInitParameter("a");
		
		String driverName = context.getInitParameter("db.driverName");
		String url = context.getInitParameter("db.url");
		String username = context.getInitParameter("db.username");
		String password = context.getInitParameter("db.password");
		
		System.out.println("a= "+a);
		System.out.println("driver ="+driverName);
		System.out.println("url ="+url);
	}
	
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service method called");
		//response
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Servlet page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Welcome to MyServlet Page</p>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
