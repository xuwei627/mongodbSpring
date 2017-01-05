package com.soft.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.entity.Users;
import com.soft.service.UserManager;

@Controller("index")
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Users users;
	private UserManager manager;
	public String execute(){
		if(manager.exits(users)){
			return "fail";
		}
		manager.add(users);
		return SUCCESS;
		
	}
	
	public UserManager getManager() {
		return manager;
	}

	@Resource
	public void setManager(UserManager manager) {
		this.manager = manager;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
