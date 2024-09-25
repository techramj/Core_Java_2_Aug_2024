package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	
	/*@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		System.out.println("usernmae: "+user+"  password: "+pwd);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Servlet page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Welcome "+user+"</p>");
		out.println("</body>");
		out.println("</html>");
	}*/
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get method called");
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		System.out.println("usernmae: "+user+"  password: "+pwd);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Servlet page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Welcome "+user+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post method called");
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		System.out.println("usernmae: "+user+"  password: "+pwd);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Servlet page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Welcome "+user+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
	
	
    
}
