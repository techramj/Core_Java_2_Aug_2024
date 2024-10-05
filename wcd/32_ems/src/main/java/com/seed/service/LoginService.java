package com.seed.service;

import java.sql.Connection;
import java.util.List;

import com.seed.dao.UserDao;
import com.seed.entity.User;

public class LoginService {
	
	private UserDao userDao;
	
	public LoginService(Connection connection) {
		userDao = new UserDao(connection);
	}
	
	public User getUser(String username, String password) {
		User user = userDao.findUserByUserName(username);
		if(user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
	
	public User getUser(String username) {
		User user = userDao.findUserByUserName(username);
		return user;
	}
	
	public List<String> getFriends(String username){
		List<String> friends = userDao.getFriends(username);
		return friends;
	}
	
	public void  addFriend(String username, String friend) {
		User user = userDao.findUserByUserName(username);
		userDao.addFriends( user.getId(), friend);
	}

}
