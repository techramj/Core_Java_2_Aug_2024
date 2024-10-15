package com.seed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.seed.entity.User;
import com.seed.util.ConnectionUtil;

public class UserDao {
	
	private Connection connection;
	
	public UserDao() {
		this.connection = ConnectionUtil.getConnection();
	}
	
	public User findUserByUserName(String username) {
		String sql = "select * from users where username = ?";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, username);
	
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt(1);
				String fnmae = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				
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
	
	public User findUserById(int userId) {
		return null;
	}
	
	public void addUser(User user) {
		//logic
	}
	
	public void updateUser(User user) {
		
	}
	
	
	public List<String> getFriends(String usernmae){
		String sql ="select f.name from friends f join users  u on  f.userid = u.userid where username = ?";
		
		List<String> friends = new ArrayList<>();		
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, usernmae);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String friend = rs.getNString(1);
				friends.add(friend);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return friends;
		
	}
	
	public void addFriends(int userId, String name) {
		String sql ="insert into friends (userid,name) values (?, ?)";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(2, name);
			ps.setInt(1, userId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

}
