package com.soft.service.impl;

import com.soft.dao.UserDao;
import com.soft.dao.impl.UserDaoImpl;
import com.soft.entity.Users;
import com.soft.service.UserManager;

public class UserManagerImpl implements UserManager {
	
	UserDao dao = new UserDaoImpl();
	
	@Override
	public boolean exits(Users user) {
		return dao.exist(user);
	}

	@Override
	public void add(Users user) {
		dao.add(user);
	}

}
