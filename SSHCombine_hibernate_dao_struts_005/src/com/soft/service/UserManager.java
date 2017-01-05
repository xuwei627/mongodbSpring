package com.soft.service;

import com.soft.entity.Users;

public interface UserManager {

	public boolean exits(Users user);
	
	public void add(Users user);
}
