package com.soft.xww.service.impl;

import com.soft.xww.dao.UserDao;
import com.soft.xww.dao.impl.UserDaoImpl;
import com.soft.xww.model.Users;
import com.soft.xww.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public String userLogin(Users user) {
		Users us = userDao.selectUserExsit(user);
		return us == null?"fail":"success";
	}

}
