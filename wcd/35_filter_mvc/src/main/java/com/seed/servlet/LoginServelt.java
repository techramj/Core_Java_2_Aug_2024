package com.seed.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelt
 */
@WebServlet("/login")
public class LoginServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass().getSimpleName()+" called");
		/*String password = request.getParameter("password");
		if("123".equals(password)) {
			System.out.println("validation passed");
			RequestDispatcher rd = request.getRequestDispatcher("page1.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("validation failed");
			response.sendRedirect("login.jsp");
		}*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("page1.jsp");
		rd.forward(request, response);
	}

}
