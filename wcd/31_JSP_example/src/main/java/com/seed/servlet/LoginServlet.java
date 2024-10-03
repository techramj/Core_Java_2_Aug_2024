package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this is get method
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		
		int a = 10;
		
		out.println("<html><body>");
		out.println("<p>Wecome "+username+"</p>");
		out.println("<p>a= "+a+"</p>");
		
		out.println("request="+request);
		out.println("<br>");
		
		out.println("response="+response);
		out.println("<br>");
		
		out.println("config="+config);
		out.println("<br>");
		
		out.println("context="+context);
		
		out.println("<h5 align='left'>"+new Date()+"</h5");
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
