package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seed.service.LoginService;

/**
 * Servlet implementation class FriendServlet
 */
@WebServlet("/addFriend")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService loginService;

	@Override
	public void init() throws ServletException {
		Connection con = (Connection) getServletContext().getAttribute("connection");
		loginService = new LoginService(con);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cookie[] cookies =request.getCookies();

		String username = null;
		for(Cookie c: cookies) {
			System.out.println(c.getName()+"  =  "+c.getValue());
			if(c.getName().equals("username")) {
				username = c.getValue();
			}
		}
		String friend = request.getParameter("friend");
		

		PrintWriter out = response.getWriter();
		out.println("<p>friend of "+username+" is "+ friend+"</p>");

		// logic to save the friend in db.
		loginService.addFriend(username, friend);
		
		RequestDispatcher rd = request.getRequestDispatcher("login");
		rd.include(request, response);
	}

}
