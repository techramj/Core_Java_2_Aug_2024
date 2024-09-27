package com.seed.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seed.util.ConnectionUtil;

public class ServletOne extends HttpServlet {
	
	private Connection connection;
	
	
	@Override
	public void init() throws ServletException {
		
		ServletContext context = getServletContext();
		
		String driverName = context.getInitParameter("db.driverName");
		String url = context.getInitParameter("db.url");
		String username = context.getInitParameter("db.username");
		String password = context.getInitParameter("db.password");
		
		connection = ConnectionUtil.getConnection(driverName, url, username, password);
		System.out.println("connection: "+connection);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//connection object
		System.out.println("ServletOne get method");
		System.out.println(connection);
	
	}

}
