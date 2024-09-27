package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletD extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet B Get method");
		PrintWriter out = resp.getWriter();
	    out.println("<p>Servlet B Get method</p>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet B post method");
		PrintWriter out = resp.getWriter();
	   out.println("<p>Servlet B Post method</p>");
	   String approval = (String) req.getAttribute("managerApproval");
	   out.println("<p>Manager Approval: "+"<b>"+approval+"</b></p>");
	   out.println("<p>VC Approval: "+"<b>"+"Rejected</b></p>");
	}
}
