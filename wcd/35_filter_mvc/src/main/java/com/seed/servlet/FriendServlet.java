package com.seed.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FriendServlet
 */
@WebServlet("/friend")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//long l1 = System.currentTimeMillis();
		System.out.println(this.getClass().getSimpleName()+" called");
		/*String password = request.getParameter("password");
		if("123".equals(password)) {
			System.out.println("validation passed");
			RequestDispatcher rd = request.getRequestDispatcher("page2.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("validation failed");
			response.sendRedirect("login.jsp");
		}*/
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("page2.jsp");
		//long l2 = System.currentTimeMillis();
		//System.out.println("time take by "+request.getRequestURI()+"  is "+(l2-l1)+" ms");
		rd.forward(request, response);
	}

}
