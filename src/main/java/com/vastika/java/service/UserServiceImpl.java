package com.vastika.java.service;

import com.vastika.java.dao.UserDao;
import com.vastika.java.dao.UserDaoImpl;
import com.vastika.java.model.User;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	@Override
	public int saveUserInfo(User user) {
		return userDao.saveUserInfo(user);
		
	}


}
