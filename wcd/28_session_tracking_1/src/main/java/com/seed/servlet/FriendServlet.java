package com.seed.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FriendServlet
 */
@WebServlet("/addFriend")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		String username = request.getParameter("username");
		//String username = (String) context.getAttribute("username");
		String friend = request.getParameter("friend");
		
		
		response.getWriter().append("The friend of username:"+username+" is friend:"+friend );
		
		//logic to save the friend in db.
	}

}
