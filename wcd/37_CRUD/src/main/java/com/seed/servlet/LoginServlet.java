package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.entity.Employee;
import com.seed.entity.User;
import com.seed.service.EmployeeService;
import com.seed.service.LoginService;
import com.seed.util.ConnectionUtil;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService = new LoginService();
	private EmployeeService empService = new EmployeeService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet get method called");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = loginService.getUser(username, password);
		
		String view;

		if( user != null) {
			HttpSession session = request.getSession();   
			session.setAttribute("user", user);  //model

			List<Employee> employees = empService.getEmployees();
			session.setAttribute("empList", employees);
		
			view = "homePage.jsp";
			
		}else {
			request.setAttribute("errorMessage", "Invalid username and password"); //model
			view = "index.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		User user =  loginService.getUser(username);
	
	}
	
	
	

}
