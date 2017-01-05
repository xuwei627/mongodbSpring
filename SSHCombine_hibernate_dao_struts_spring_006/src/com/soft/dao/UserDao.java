package com.soft.dao;

import com.soft.entity.Users;

public interface UserDao {

	public void add(Users user);
	public boolean exist(Users user);
}
