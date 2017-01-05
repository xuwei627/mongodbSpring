package com.soft.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.soft.dao.UserDao;
import com.soft.entity.Users;
import com.soft.service.UserManager;

@Component("userManager")
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

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
