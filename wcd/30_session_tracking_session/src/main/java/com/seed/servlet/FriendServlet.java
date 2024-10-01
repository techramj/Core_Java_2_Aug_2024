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
import javax.servlet.http.HttpSession;

import com.seed.entity.User;
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
		
		HttpSession session = request.getSession(true);
		System.out.println(this.getClass().getSimpleName()+"   "+session.getId());
		User user = (User) session.getAttribute("user");
		String friend = request.getParameter("friend");
		

		PrintWriter out = response.getWriter();
		out.println("<p>friend of "+user.getFirstName()+" is "+ friend+"</p>");

		// logic to save the friend in db.
		loginService.addFriend(user.getUsername(), friend);
		
		RequestDispatcher rd = request.getRequestDispatcher("login");
		rd.include(request, response);
	}

}
