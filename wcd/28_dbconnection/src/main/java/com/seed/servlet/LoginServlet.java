package com.seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seed.entity.User;
import com.seed.util.ConnectionUtil;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	public void init() throws ServletException {

		ServletContext context = getServletContext();
		
		String driverName = context.getInitParameter("db.driverName");
		String url = context.getInitParameter("db.url");
		String username = context.getInitParameter("db.username");
		String password = context.getInitParameter("db.password");
		
		Connection connection = ConnectionUtil.getConnection(driverName, url, username, password);
		
		context.setAttribute("connection", connection);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet get method called");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//validate username & password
		Connection con = (Connection) request.getServletContext().getAttribute("connection");
		User user = getUser(username, password,  con);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if( user != null) {
			out.println("<p>Welcome "+user.getFirstName()+" "+user.getLastName()+"</p>");
		}else {
			out.println("<p>Invalid username and password!</p>");
			out.println("<a href='login.html'>Click Here</a> for Login Page");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
	
	private User getUser(String username , String password, Connection conn) {
		String sql ="select * from users where username =? and password =?";
		try(PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt(1);
				String fnmae = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				
				User user  = new User();
				user.setId(id);
				user.setUsername(username);
				user.setPassword(password);
				user.setFirstName(fnmae);
				user.setLastName(lname);
				user.setEmail(email);
				return user;
			}
			
			

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
