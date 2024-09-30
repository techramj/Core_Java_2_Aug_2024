package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seed.entity.User;
import com.seed.service.LoginService;
import com.seed.util.ConnectionUtil;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService;

 
	public void init() throws ServletException {

		ServletContext context = getServletContext();
		
		String driverName = context.getInitParameter("db.driverName");
		String url = context.getInitParameter("db.url");
		String username = context.getInitParameter("db.username");
		String password = context.getInitParameter("db.password");
		
		Connection connection = ConnectionUtil.getConnection(driverName, url, username, password);
		
		context.setAttribute("connection", connection);
		loginService = new LoginService(connection);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet get method called");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		ServletContext context = getServletContext();
		
		//validate username & password
		Connection con = (Connection) context.getAttribute("connection");
		User user = loginService.getUser(username, password);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if( user != null) {
			out.println("<p>Welcome "+user.getFirstName()+" "+user.getLastName()+"</p>");
			context.setAttribute("username", username);
			
			//list of friends
			List<String> friends = loginService.getFriends(username);
			out.println("<hr><h4>Friends</h4><hr>");
			for(int i=0;i<friends.size();i++) {
				out.println("<p>"+i+". "+friends.get(i)+"<p>");
			}
			out.println("<hr><br><br>");
			
			out.println("<form  action='addFriend' method='get' >");
			out.println("<input type='text' name='friend'> <button type=\"submit\">Add Friend</button>");
			out.println("</form>");
			
		}else {
			out.println("<p>Invalid username and password!</p>");
			out.println("<a href='login.html'>Click Here</a> for Login Page");
		}
		out.println("</body>");
		out.println("</html>");
	}
	

}
