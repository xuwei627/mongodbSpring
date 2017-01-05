package com.soft.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.soft.entity.Users;
import com.soft.service.UserManager;
import com.soft.service.impl.UserManagerImpl;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserAction(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		manager = (UserManager)ac.getBean("userManager");
	}
	
//	private HttpServletRequest re;
	private Users user;
	private UserManager manager;
	public String execute(){
		if(manager.exits(user)){
			return "fail";
		}
		manager.add(user);
		return SUCCESS;
		
	}
	
	public UserManager getManager() {
		return manager;
	}

	public void setManager(UserManager manager) {
		this.manager = manager;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
