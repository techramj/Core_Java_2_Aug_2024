package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seed.util.ConnectionUtil;

public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
		System.out.println("LoginServlet contructor called...");
	}
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("LoginServlet init method is called...");
		
		
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
		
		Connection connection = ConnectionUtil.getConnection(driverName, url, username, password);
		System.out.println("connection: "+connection);
		
		context.setAttribute("connection", connection);
		
	}
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet service method called");
		super.service(request, response);
		/*String user = request.getParameter("username");
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
		out.println("</html>");*/
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet get method called");
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
		System.out.println("LoginServlet post method called");
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
	public void destroy() {
		System.out.println("LoginServlet destroy method called");
	}
	
    
}
