package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet A Get method");
		PrintWriter out = resp.getWriter();
	    out.println("<p>Servlet A Get method</p>");
	    
	    RequestDispatcher rd = req.getRequestDispatcher("b");
	    //rd.forward(req, resp);
	    rd.include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet A Post method");
		PrintWriter out = resp.getWriter();
	    out.println("<p>Servlet A Post method</p>");
	    RequestDispatcher rd = req.getRequestDispatcher("b");
	    //rd.forward(req, resp);
	    req.setAttribute("managerApproval", "approved");
	    rd.forward(req, resp);
	}

}
