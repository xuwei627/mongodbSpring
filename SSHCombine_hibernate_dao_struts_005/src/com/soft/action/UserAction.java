package com.soft.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.entity.Users;
import com.soft.service.UserManager;
import com.soft.service.impl.UserManagerImpl;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private HttpServletRequest re;
	Users user = new Users();
	UserManager manager = new UserManagerImpl();
	public String execute(){
		if(manager.exits(user)){
			return "fail";
		}
		manager.add(user);
		return SUCCESS;
		
	}
//
//	@Override
//	public void setServletRequest(HttpServletRequest re) {
//		this.re = re;
//	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
