package com.soft.service.impl;

import com.soft.dao.UserDao;
import com.soft.entity.Users;
import com.soft.service.UserManager;

public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	
	@Override
	public boolean exits(Users user) {
		return userDao.exist(user);
	}

	@Override
	public void add(Users user) {
		userDao.add(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
